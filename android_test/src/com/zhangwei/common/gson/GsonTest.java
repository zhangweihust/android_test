package com.zhangwei.common.gson;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//21.	好友列表/推荐列表
public class GsonTest {
	private static final String TAG = "GsonTest";
	
	public static void test(){
		Gson gson = new Gson();
/*		Gson gson = new GsonBuilder().serializeNulls().create();
		
		GsonResponse.FriendListResponse req = new GsonResponse.FriendListResponse();
		req.status = "0";
		req.items = new GsonResponse.User[1];
		req.items[0].nickname = ""; */
		
		//String s = "{\"status\":0,\"items\":[{\"userId\":\"111ID\",\"nickname\":\"111n\",\"portraitUrl\":\"111url\"}]}";
		//String s = "{\"items\":[{\"portraitUrl\":\"111url\",\"userId\":\"\",\"tags\":[{\"subitem\":\"123\"}],\"nickname\":\"111n\"}],\"status\":0}"; //pass
		//String s = "{\"items\":[],\"status\":0}"; //pass
		//String s = "{\"items\":[{\"portraitUrl\":\"111url\",\"userId\":\"\",\"tags\":[],\"activeid\":[\"2\"],\"nickname\":\"111n\"}],\"status\":0}";
		String s = "{\"items\":[{\"portraitUrl\":\"111url\",\"userId\":\"\",\"tags\":[],\"activeid\":[],\"nickname\":\"111n\"}],\"status\":0}";
		
		GsonResponse.FriendListResponse r = gson.fromJson(s, GsonResponse.FriendListResponse.class);
		Log.i(TAG, s);
		Log.e(TAG, r.status);
	}
	


}
