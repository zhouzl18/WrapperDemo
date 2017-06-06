package com.feng.wrapperdemo.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.feng.wrapperdemo.R;
import com.feng.wrapperdemo.model.ActModel;

import java.util.List;

/**
 * Created by OneDay on 2017/6/6.
 */

public class MainAdapter extends ArrayAdapter<ActModel> {

    private LayoutInflater mInflater;

    @LayoutRes
    private int resource;

    public MainAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<ActModel> objects) {
        super(context, resource, objects);
        mInflater = LayoutInflater.from(context);
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        TextView tvName;
        if(convertView == null){
            convertView = mInflater.inflate(resource, parent, false);
        }
        tvName = (TextView) convertView;
        tvName.setText(getItem(position).getName());
        return convertView;
    }
}
