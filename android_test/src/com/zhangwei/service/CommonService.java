package com.zhangwei.service;

import com.zhangwei.common.cache.CacheManager;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class CommonService extends Service {


	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void onCreate() {
		super.onCreate();
		CacheManager.getInstance(getApplicationContext());

	}
	
	
	@Override
	public void onStart(Intent intent, int startId) {

		
	}
	
	@Override
	public void onDestroy() {  
	    super.onDestroy();  

	}  

}
