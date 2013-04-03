package com.zhangwei.test;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;



import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

import com.google.gson.Gson;
import com.googlecode.concurrentlinkedhashmap.ConcurrentLinkedHashMap;
import com.googlecode.concurrentlinkedhashmap.EntryWeigher;
import com.iflytek.msc.Constants;

import com.zhangwei.common.adapter.AbstractAdapter;
import com.zhangwei.common.adapter.CommonAdapter;
import com.zhangwei.common.cache.WebImageView;
import com.zhangwei.common.gson.GsonRequest;
import com.zhangwei.common.gson.GsonResponse;
import com.zhangwei.common.gson.GsonResponse.nearVideoItem;
import com.zhangwei.common.gson.GsonTest;
import com.zhangwei.common.gson.HttpClientTask;
import com.zhangwei.common.twolist.NearByVideoItemWrapper;
import com.zhangwei.common.twolist.MultiColumnListView;
import com.zhangwei.common.twolist.MultiColumnPullToRefreshListView;
import com.zhangwei.common.twolist.MultiColumnPullToRefreshListView.OnRefreshListener;
import com.zhangwei.common.twolist.NearByVideoViewBuilder;
import com.zhangwei.common.twolist.MultiColumnListView.OnLoadMoreListener;
import com.zhangwei.common.utils.ActivityUtil;
import com.zhangwei.common.utils.DumpString;

import com.zhangwei.msc.QISR;
import com.zhangwei.msc.QTTS;
import com.zhangwei.service.CommonService;

public class MainActivity extends Activity {
	public static final String TAG = "MainActivity";
	
	public static final int SHOWLINE = 0;
	public static final int SHOWHTTP = 1;
	
	QISRTask t;
	MyHandler handler;
	public TextView tv1;
	public WebImageView im1;
	
	
	
	//2listview
	//public Gson gson;
	protected AbstractAdapter<NearByVideoItemWrapper> mAdapter = null;
	public static final int PULL_TO_REFRESH_ID = 1008611;
	//protected MultiColumnListView mWaterfallView = null;
	ArrayList<NearByVideoItemWrapper> data = new ArrayList<NearByVideoItemWrapper>();
	
	
	private MultiColumnPullToRefreshListView mPulltoRefreshListView = null;
	
	
	public static class MyHandler extends Handler{ 
		WeakReference<MainActivity> mActivity;

        MyHandler(MainActivity activity) {
                mActivity = new WeakReference<MainActivity>(activity);
        }

		
		@Override
        public void handleMessage(Message msg) {
			MainActivity theActivity = mActivity.get();
			
			switch(msg.what ){
            case SHOWLINE :
                theActivity.tv1.setText((String)(msg.obj ));
               break;
            case SHOWHTTP :
            	//theActivity.tv1.setText((String)(msg.obj ));
            	//Log.e("1111111", (String)(msg.obj ));
            	//DumpString.dump((String)(msg.obj ));
            	Gson gson = new Gson();
            	GsonResponse.nearVideoResponse response =  gson.fromJson((String)(msg.obj ), GsonResponse.nearVideoResponse.class);
            	for(nearVideoItem a : response.items){
            		theActivity.data.add(new NearByVideoItemWrapper(a));
            	}
            	theActivity.mAdapter.update(theActivity.data);
            	gson=null;
            	break;

           }

		}
	}
	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv1 = (TextView) this.findViewById(R.id.textView1);
		im1 = (WebImageView) findViewById(R.id.webImage);
		handler = new MyHandler(this);
		
		
		mPulltoRefreshListView = (MultiColumnPullToRefreshListView) findViewById(R.id.list);
		//mWaterfallView = (MultiColumnListView) findViewById(R.id.list);
		
		
		mPulltoRefreshListView.setOnRefreshListener(new OnRefreshListener() {
			@Override
			public void onRefresh() {
				// ----     mAdapter.update(ImgResource.genData());
				mAdapter.notifyDataSetInvalidated();
				//3秒后完成
				new Handler().postDelayed(new Runnable(){
					@Override
					public void run() {
						mPulltoRefreshListView.onRefreshComplete();
					}
				}, 3000);
			}
		});
		
		mPulltoRefreshListView.setOnLoadMoreListener(new OnLoadMoreListener() {
			@Override
			public void onLoadMore() {
				// --- mAdapter.add(ImgResource.genData());
				mAdapter.notifyDataSetChanged();
				ActivityUtil.show(MainActivity.this, "到List底部自动加载更多数据");
				//5秒后完成
				new Handler().postDelayed(new Runnable(){
					@Override
					public void run() {
						mPulltoRefreshListView.onLoadMoreComplete();
					}
				}, 5000);
			}
		});
		
		mAdapter = new CommonAdapter<NearByVideoItemWrapper>(getLayoutInflater(), new NearByVideoViewBuilder());
		mPulltoRefreshListView.setAdapter(mAdapter);
		


		startService(new Intent(this, CommonService.class));
		
/*		QTTSTask t = new QTTSTask();
		t.execute("5150f897");*/
/*		h = new MyHandler(this);
		t = new QISRTask();
		t.execute(h);*/
		


		//im1.setImageUrl(R.drawable.ic_launcher, "http://img2.paipaiimg.com/42b87c2f/item-51452683-1A56F6320000000004010000043EB0C0.0.300x300.jpg");

		im1.setImageUrl(R.drawable.ic_launcher, "http://1img.looklook.cn:7076/pr/api/showPicture?type=1&imageurl=head/201302/08/0148467b78b21f36413b957867dac208db19.jpg");
		//GsonTest.test();
		
		
		/*
		 * Thread t = new Thread(){ public void run(){ Map<String,Object> map =
		 * new HashMap<String, Object>(); map.put("name", "Peter");
		 * map.put("age", 21); map.put("friends", null); String s =
		 * Json.toJson(map); //Log.d("debug", s); } }; t.start();
		 */
		
		//LRULinkedHashMap t = new LRULinkedHashMap(1000);
		Gson gson = new Gson();
		GsonRequest.nearVideoRequest req = new GsonRequest.nearVideoRequest();
		//.userid = "";
		req.pageno = "1";
		req.pagesize = "16";
		req.latitude =   "39.911380";     //"39.911370";
		req.longitude = "116.491632";  //"116.491602";
		req.videowidth = "320";
		
		
		HttpClientTask task = new HttpClientTask(this, handler);
		task.execute("http://v.looklook.cn:7074/vs/api/nearVideo", gson.toJson(req));
		//gson = null;
		//String tmp = DumpString.read("/mnt/sdcard/input.txt");
		//Log.e(TAG, tmp);
    	//Gson gson = new Gson();
    	//GsonResponse.nearVideoResponse response =  gson.fromJson(tmp, GsonResponse.nearVideoResponse.class);
	
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	@Override
	public void onDestroy(){
		super.onDestroy();
		
		if (t != null && t.getStatus() != AsyncTask.Status.FINISHED){
			t.cancel(true);
		}

			            

	}

	private class QTTSTask extends AsyncTask<Handler, Void, Void> {
		@Override
		protected Void doInBackground(Handler... params) {
			//String appID = params[0];
			Handler h = params[0];
			QTTS q = new QTTS(h, Constants.appID);
			
			q.Init();
			q.Process("/sdcard/zw1.pcm", "abcdefg");
			
			q.Fini();

			return null;
		}


	}
	
	private class QISRTask extends AsyncTask<Handler, String, String> {
		@Override
		protected String doInBackground(Handler... params) {
			//String appID = params[0];
			Handler h = params[0];
			QISR q = new QISR(h, Constants.appID);
			
			q.Init();
			//q.Process("/sdcard/test.wav");
			q.Process("/sdcard/nihao.wav");
			//q.Process("/sdcard/zw1.wav");
			//q.Process("/sdcard/zw1.pcm");
			q.Fini();

			Log.e("dddd", q.getResult());
			return q.getResult();
		}

		@Override
		protected void onPostExecute (String result) {
			Toast.makeText(getApplication(), result, Toast.LENGTH_LONG).show();
		}

		@Override
		protected void onProgressUpdate (String... values){
			
		}
	}
	
	


}
