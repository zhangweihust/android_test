package com.zhangwei.common.twolist;

import it.sauronsoftware.base64.Base64;

import com.zhangwei.common.cache.WebImageView;
import com.zhangwei.common.utils.ViewBuilder;
import com.zhangwei.test.R;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;


/**
 * @author : 
 * @email  : 
 * @date   : 
 * @desc   : TODO
 */
public class NearByVideoViewBuilder extends ViewBuilder<NearByVideoItemWrapper> {

	@Override
	public View createView(LayoutInflater inflater, int position,
			NearByVideoItemWrapper data) {
		View view = inflater.inflate(R.layout.item_sample, null);
		updateView(view, position, data);
		return view;
	}

	@Override
	public void updateView(View view, int position, NearByVideoItemWrapper data) {
		WebImageView image = (WebImageView) view.findViewById(R.id.thumbnail);
		TextView text = (TextView) view.findViewById(R.id.text);
		//text.setText("W="+data.width + ", H="+data.height + ", ID="+String.valueOf(data.id));
		text.setText(Base64.decode(data.item.position));
		//		
		LinearLayout.LayoutParams params = (LayoutParams) image.getLayoutParams();
		params.width = Integer.parseInt(data.item.show_width)/2;
		params.height = Integer.parseInt(data.item.show_height)/2;
		image.setLayoutParams(params);
		image.setAdjustViewBounds(false);
		//image.setBackgroundColor((int)(0xFF555555 + data.id * 255 * 24));
		image.setImageUrl(R.drawable.ic_launcher, data.item.videoimage);
		image.invalidate();
	}
}
