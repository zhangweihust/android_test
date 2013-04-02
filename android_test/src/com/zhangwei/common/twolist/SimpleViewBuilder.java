package com.zhangwei.common.twolist;

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
public class SimpleViewBuilder extends ViewBuilder<ImageWrapper> {

	@Override
	public View createView(LayoutInflater inflater, int position,
			ImageWrapper data) {
		View view = inflater.inflate(R.layout.item_sample, null);
		updateView(view, position, data);
		return view;
	}

	@Override
	public void updateView(View view, int position, ImageWrapper data) {
		ImageView image = (ImageView) view.findViewById(R.id.thumbnail);
		TextView text = (TextView) view.findViewById(R.id.text);
		text.setText("W="+data.width + ", H="+data.height + ", ID="+String.valueOf(data.id));
		
		//
		LayoutParams layoutParams = new LayoutParams(data.width, 
				data.height); 
		image.setLayoutParams(layoutParams); 

		//
		
		
		//LinearLayout.LayoutParams params = (LayoutParams) image.getLayoutParams();
		//params.width = data.width;
		//params.height = data.height;
		//image.setLayoutParams(params);
		image.setAdjustViewBounds(false);
		//image.setBackgroundColor((int)(0xFF555555 + data.id * 255 * 24));
		image.setImageResource(data.res);
		image.invalidate();
	}
}
