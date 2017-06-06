package com.feng.wrapperdemo.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by OneDay on 2017/6/5.
 *
 * BaseActivity
 *
 */

public class BaseActivity extends AppCompatActivity {

    private static final String TAG = "BaseActivity";
    protected Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        Log.i(TAG, "onCreate: " + getClass().getSimpleName());
    }
}
