package com.feng.wrapperdemo.wrap.vp;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import com.feng.wrapperdemo.R;

import java.util.List;

/**
 * Created by OneDay on 2017/6/5.
 *
 * 通用的ViewPager
 *
 */

public class CommonViewPager<T> extends RelativeLayout{

    private ViewPager mViewPager;
    private CommonPagerAdapter mAdapter;

    public CommonViewPager(Context context) {
        super(context);
        init();
    }

    public CommonViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CommonViewPager(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.common_view_pager_layout, this, true);
        mViewPager = (ViewPager) view.findViewById(R.id.common_view_pager);
    }

    public void setPages(List<T> data, ViewPagerHolderCreator creator){
        mAdapter = new CommonPagerAdapter(data, creator);
        mViewPager.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();

    }

    public void setCurrentItem(int currentItem){
        mViewPager.setCurrentItem(currentItem);
    }

    public int getCurrentItem(){
        return mViewPager.getCurrentItem();
    }

    public void setOffscreenPageLimit(int limit){
        mViewPager.setOffscreenPageLimit(limit);
    }

    public void setPageTransformer(boolean reverseDrawingOrder, ViewPager.PageTransformer transformer){
        mViewPager.setPageTransformer(reverseDrawingOrder, transformer);
    }

    public void addOnPageChangeListener(ViewPager.OnPageChangeListener listener){
        mViewPager.addOnPageChangeListener(listener);
    }

    private void setIndicatorVisible(boolean visible){
        // TODO: 2017/6/6
    }

    public ViewPager getViewPager(){
        return mViewPager;
    }
}
