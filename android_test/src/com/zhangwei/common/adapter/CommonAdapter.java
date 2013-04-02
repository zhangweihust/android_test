package com.zhangwei.common.adapter;




import com.zhangwei.common.utils.ViewCreator;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author : 桥下一粒砂
 * @email  : chenyoca@gmail.com
 * @date   : 2012-9-13
 * @desc   : TODO
 * @param <T>
 */
public class CommonAdapter<T> extends AbstractAdapter<T> {

	public CommonAdapter(LayoutInflater inflater, ViewCreator<T> creator) {
		super(inflater, creator);
	}

	@Override
	public View getView(int pos, View convertView, ViewGroup parent) {
		T data = mDataCache.get(pos);
		if(null == convertView){
			convertView = mCreator.createView(mInflater, pos, data);
		}else{
			mCreator.updateView(convertView, pos, data);
		}
		return convertView;
	}

}

