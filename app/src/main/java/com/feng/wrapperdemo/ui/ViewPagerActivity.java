package com.feng.wrapperdemo.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.feng.wrapperdemo.R;
import com.feng.wrapperdemo.model.ImageModel;
import com.feng.wrapperdemo.wrap.vp.CommonViewPager;
import com.feng.wrapperdemo.wrap.vp.ViewPagerHolder;
import com.feng.wrapperdemo.wrap.vp.ViewPagerHolderCreator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OneDay on 2017/6/5.
 *
 * 展示自定义的
 *
 */

public class ViewPagerActivity extends BaseActivity {
    private static final String TAG = "ViewPagerActivity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);

        initViews();
    }

    private void initViews() {
        CommonViewPager viewPager = (CommonViewPager) findViewById(R.id.common_view_pager);
        viewPager.setPages(getData(), new ViewPagerHolderCreator() {
            @Override
            public ViewPagerHolder createViewHolder() {
                return new ImageViewHolder();
            }
        });
    }

    public static class ImageViewHolder implements ViewPagerHolder<ImageModel>{
        private ImageView ivBg;
        private TextView tvName;

        @Override
        public View createView(@NonNull Context context) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_view_pager, null);
            ivBg = (ImageView) view.findViewById(R.id.item_vp_image);
            tvName = (TextView) view.findViewById(R.id.item_vp_name);
            return view;
        }

        @Override
        public void onBind(@NonNull Context context, int position, ImageModel data) {
            Glide.with(context).load(data.getUrl()).into(ivBg);
            tvName.setText(data.getName());
        }
    }

    private List<ImageModel> getData(){
        List<ImageModel> data = new ArrayList<>();
        data.add(new ImageModel("http://pic75.nipic.com/file/20150817/21514456_110149306000_2.jpg", "小黄人"));
        data.add(new ImageModel("http://img.tuku.cn/file_thumb/201404/m2014041700203480.jpg", "白云"));
        data.add(new ImageModel("http://pic16.nipic.com/20110830/8268710_212012150133_2.jpg", "山水"));
        data.add(new ImageModel("http://t1.niutuku.com/960/17/17-108714.jpg", "花"));
        return data;
    }
}
