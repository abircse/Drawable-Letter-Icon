package com.coxtunes.drawablelettericon.drawablelettericon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> stringArrayList;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.mylistview);
        setData();
        adapter = new MyAdapter(this, R.layout.layoutdemo, stringArrayList);
        listView.setAdapter(adapter);
    }

    private void setData() {
        stringArrayList = new ArrayList<>();
        stringArrayList.add("আবির");
        stringArrayList.add("সাইফুল");
        stringArrayList.add("বাপ্পি");
        stringArrayList.add("ইমরান");
        stringArrayList.add("শান্তা");
        stringArrayList.add("আশরাফা");
        stringArrayList.add("নাসরিন");
    }
}
