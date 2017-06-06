package com.feng.wrapperdemo.wrap.vp;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by OneDay on 2017/6/5.
 *
 * 通用的ViewPagerAdapter
 *
 */

public class CommonPagerAdapter<T> extends PagerAdapter {
    private List<T> mDatas;
    private ViewPagerHolderCreator mCreator;

    public CommonPagerAdapter(List<T> mDatas, ViewPagerHolderCreator mCreator) {
        this.mDatas = mDatas;
        this.mCreator = mCreator;
    }

    @Override
    public int getCount() {
        return mDatas != null ? mDatas.size() : 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = getView(position, null, container);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    /**
     * 获取ViewPager页面展示的View
     * @param position  position
     * @param view  view
     * @param container container
     * @return
     */
    private View getView(int position, View view, ViewGroup container){
        ViewPagerHolder holder = null;
        if(view == null){
            holder = mCreator.createViewHolder();
            view = holder.createView(container.getContext());
            view.setTag(holder);
        }else{
            holder = (ViewPagerHolder) view.getTag();
        }

        if(holder != null && mDatas != null && !mDatas.isEmpty()){
            holder.onBind(container.getContext(), position, mDatas.get(position));
        }
        return view;
    }
}
