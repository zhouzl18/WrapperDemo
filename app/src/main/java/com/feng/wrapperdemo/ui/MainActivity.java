package com.feng.wrapperdemo.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.feng.wrapperdemo.R;
import com.feng.wrapperdemo.adapter.MainAdapter;
import com.feng.wrapperdemo.model.ActModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListActivity {

    private List<ActModel> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<ActModel> adapter = new MainAdapter(this, android.R.layout.simple_list_item_1, getData());
        setListAdapter(adapter);

    }

    private List<ActModel> getData(){
        if(data == null) data = new ArrayList<>();
        data.add(new ActModel(ViewPagerActivity.class.getSimpleName(), ViewPagerActivity.class));
        return data;
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        startMyActivity(data.get(position));
    }

    private void startMyActivity(ActModel actModel) {
        Intent intent = new Intent(this, actModel.getT());
        startActivity(intent);
    }
}
