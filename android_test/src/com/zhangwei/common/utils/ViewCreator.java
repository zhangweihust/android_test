package com.zhangwei.common.utils;



import android.view.LayoutInflater;
import android.view.View;

/**
 * @author : 桥下一粒砂
 * @email  : chenyoca@gmail.com
 * @date   : 2012-7-14
 * @desc   : 创建View和更新View的接口
 * @param <E>
 */
public interface ViewCreator<E> {
    /**
     * <b>description :</b>			创建View,HolderAdapter需要创建View时，会调用此方法创建View。
     * </br><b>time :</b> 			2012-7-10 下午11:03:47
     * @param inflater
     * @param position
     * @param data
     * @return
     */
    View createView(LayoutInflater inflater, int position, E data);

    /**
     * <b>description :</b>			更新View 
     * </br><b>time :</b> 			2012-7-10 下午11:04:30
     * @param view
     * @param position
     * @param data
     */
    void updateView(View view, int position, E data);
    
    /**
     * <b>description :</b>		这个View将被从可显示区中移除
     * </br><b>time :</b>		2012-9-13 下午10:52:30
     * @param view
     * @param position
     * @param data
     */
    void releaseView(View view, E data);
};