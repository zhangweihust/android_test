package com.zhangwei.common.cache;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.apache.http.util.ByteArrayBuffer;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;

public class WebImageView extends ImageView {
	private final static String TAG = "WebImageView";
	
	private Drawable mDefaultImage, mImage;

	public WebImageView(Context context) {
		this(context, null);
	}

	public WebImageView(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public WebImageView(Context context, AttributeSet attrs, int defaultStyle) {
		super(context, attrs, defaultStyle);
	}

	// mDefaultImage 用于本地和网络都没有的时刻，含网络加载中
    private void setPlaceholderImage(int resid) {
		mDefaultImage = getResources().getDrawable(resid);
	}

	public void setImageUrl(int defaultRes, String url) {

		String Key = MD5.encode(CacheManager.CHACHE_PREFIX, url.getBytes());
	    CacheResult mw = CacheManager.getInstance(getContext()).getItem(Key);
	    
		setPlaceholderImage(defaultRes);

	    if(mw==null || mw.fileSize<=0){
	    	//not hit:
	    	Log.e(TAG, "not hit, try to loadNetPicture");
	    	loadNetPicture(url);
	    }else{
	    	//hit:
	    	Log.e(TAG, "hit, try to load from local cache");
	    	//try to load local image file
	    	try {
	    		Bitmap bitmap = BitmapFactory.decodeStream(getContext().openFileInput(Key));
	    		setImageBitmap(bitmap);
	    	} catch (FileNotFoundException e) {
	    		Log.e("Exception", e.getMessage(),e);
	    		loadNetPicture(url);
	    	}
	    }
	    
	}
	
	private void loadNetPicture(String url){
		//未命中，先使用默认图片，然后同时下载网络图片
		if(mDefaultImage!=null){
			setImageDrawable(mDefaultImage);
		}else{
			Log.e(TAG, "mDefaultImage not init, return!");
			return;
		}
		DownloadTask task = new DownloadTask();
		task.execute(url);
	}

	private class DownloadTask extends AsyncTask<String, Void, CacheResult> {
		

		
		@Override
		protected CacheResult doInBackground(String... params) {
			BufferedInputStream bis;
			String url = params[0];
			String Key = MD5.encode(CacheManager.CHACHE_PREFIX,url.getBytes());
			try {
				Log.e("TAG", "download task");
				URLConnection connection = (new URL(url)).openConnection();
				InputStream is = connection.getInputStream();
				bis = new BufferedInputStream(is);
				ByteArrayBuffer baf = new ByteArrayBuffer(50);
				int current = 0;
				while ((current = bis.read()) != -1) {
					baf.append((byte) current);
				}
				
				bis.close();
				
				byte[] imageData = baf.toByteArray();
				
				//save file
				FileOutputStream mOutput = getContext().openFileOutput(Key, Activity.MODE_PRIVATE);
				mOutput.write(imageData);
				mOutput.close();				
				
				return new CacheResult(Key, imageData.length);
			} catch (Exception exc) {
				exc.printStackTrace();
				return null;
			}
		}

		@Override
		protected void onPostExecute(CacheResult result) {
			if(result==null || result.fileSize<=0){
				if(mDefaultImage!=null){
					setImageDrawable(mDefaultImage);
				}else{
					Log.e(TAG, "mDefaultImage not set");
				}
				return;
			}
			
	    	//try to load local image file
	    	try {
	    		Bitmap bitmap = BitmapFactory.decodeStream(getContext().openFileInput(result.key));
	    		setImageBitmap(bitmap);
	    		CacheManager.getInstance(getContext()).putItem(result.key, result);
	    	} catch (FileNotFoundException e) {
	    		Log.e("Exception", e.getMessage(),e);
	    	}
			
		}
	};
}
