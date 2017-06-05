package com.feng.wrapperdemo;

/**
 * Created by OneDay on 2017/6/5.
 *
 * 生成器
 * 用来生产各种 {@link ViewPagerHolder}
 *
 */

public interface ViewPagerHolderCreator<VH extends ViewPagerHolder> {

    /**
     * 创建ViewPagerHolder
     * @return VH
     */
    VH createViewHolder();
}
