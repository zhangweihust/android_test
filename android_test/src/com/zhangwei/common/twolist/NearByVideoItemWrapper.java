package com.zhangwei.common.twolist;

import com.zhangwei.common.gson.GsonResponse;
import com.zhangwei.common.gson.GsonResponse.nearVideoItem;



public class NearByVideoItemWrapper {

/*	public int width = 230;
	

	public int height;
	
	public int res;
	public String url;
	public long id;*/
	public NearByVideoItemWrapper(nearVideoItem it){
		item = it;
	}
	
	public nearVideoItem item;
}
