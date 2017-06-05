package com.feng.wrapperdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;

import java.util.List;

/**
 * Created by OneDay on 2017/6/5.
 *
 * 接口
 * 提供布局和绑定数据
 */

public interface ViewPagerHolder<T> {

    /**
     * 创建View
     * @param context   context
     * @return
     */
    View createView(@NonNull Context context);

    /**
     * 绑定数据
     * @param context   context
     * @param position  position
     * @param data      data
     */
    void onBind(@NonNull Context context, int position, T data);
}
