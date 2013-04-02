package com.zhangwei.common.gson;

import android.util.Log;

import com.google.gson.Gson;

//21.	好友列表/推荐列表
public class GsonTest {
	private static final String TAG = "GsonTest";
	
	public static void test(){
		Gson gson = new Gson();
		
		//String s = "{\"status\":0,\"items\":[{\"userId\":\"111ID\",\"nickname\":\"111n\",\"portraitUrl\":\"111url\"}]}";
		String s = "{\"items\":[{\"portraitUrl\":\"111url\",\"userId\":\"111ID\",\"nickname\":\"111n\"}],\"status\":0}";
		
		GsonResponse.FriendListResponse r = gson.fromJson(s, GsonResponse.FriendListResponse.class);
		Log.e(TAG, r.items[0].portraitUrl);
	}
	


}
