package com.zhangwei.common.cache;



public class CacheResult {
	public CacheResult(String key, int fileSize){
		//this.drawable = drawable;
		this.fileSize = fileSize;
		this.key = key;
	}
	
	//public Drawable drawable;
	public int fileSize;
	public String key;

}
