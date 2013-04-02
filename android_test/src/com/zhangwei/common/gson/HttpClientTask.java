package com.zhangwei.common.gson;

import java.lang.reflect.Type;

import com.zhangwei.test.MainActivity;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;


public class HttpClientTask extends AsyncTask<String, Void, String>{
	private Context context;
	private Handler handler;
	private String typeOfClass;
	
	public HttpClientTask(Context c, Handler h) {  
		super();  
		this.context = c;  
		this.handler = h;  
	}  

/*	@Override
	protected <T> T  doInBackground(String... params) {
		//String appID = params[0];
		String h = params[0];
		HttpRequestUtils q = new HttpRequestUtils();
		

		q.sendPostRequest(url, json, classOfT);

		return null;
	}*/

	@Override
	protected   String doInBackground(String... params) {
		// TODO Auto-generated method stub
		
		String url = params[0];
		String json = params[1];
		//typeOfClass = params[2];
		
		HttpRequestUtils q = new HttpRequestUtils();
		String result =  q.sendPostRequest(url, json);

		return result;//result is response of json string  from server

	}
	

	@Override  
	protected void onPostExecute(String result) {  
		if(result!=null){
			//send it to handler, update UI
			Message msg = new Message();
			msg.what = MainActivity.SHOWHTTP;
			msg.obj = result;
			handler.sendMessage(msg);
		}
	}


}

