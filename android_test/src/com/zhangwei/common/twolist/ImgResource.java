package com.zhangwei.common.twolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * @author : 桥下一粒砂
 * @email  : chenyoca@gmail.com
 * @date   : 2012-12-6
 * @desc   : TODO
 */
public class ImgResource {

	public static final int[] imageResource = {
/*			R.drawable.image_1,
			R.drawable.image_2,
			R.drawable.image_3,
			R.drawable.image_4,
			R.drawable.image_5,
			R.drawable.image_6,
			R.drawable.image_7,
			R.drawable.image_8,
			R.drawable.image_9,
			R.drawable.image_10,
			R.drawable.image_11,
			R.drawable.image_12,
			R.drawable.image_13,
			R.drawable.image_14,
			R.drawable.image_15,
			R.drawable.image_16,
			R.drawable.image_17,
			R.drawable.image_18,
			R.drawable.image_19,
			R.drawable.image_20,*/
	};
	
	private static Random RND = new Random();
	public static List<NearByVideoItemWrapper> genData(){
		List<NearByVideoItemWrapper> data = new ArrayList<NearByVideoItemWrapper>();
		int count = ImgResource.imageResource.length/2 + RND.nextInt(ImgResource.imageResource.length/2);
		for(int i=0;i<count;i++){
			NearByVideoItemWrapper iw = new NearByVideoItemWrapper();
			iw.width = 230;
			iw.height = 230 + i*20;
			iw.id = i;
			iw.res = ImgResource.imageResource[i];
			data.add(iw);
		}
		return data;
	}
}
