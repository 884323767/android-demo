package com.example.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Main7Activity extends AppCompatActivity {

    //数据源
    private static final String[] commonFunList = new String[]{
            "ListView1",
            "ListView2",
            "ListView3",
            "ListView4",
            "ListView5"
    };

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Toast.makeText(getApplicationContext(), "page7", Toast.LENGTH_SHORT).show();

        listView = (ListView) findViewById(R.id.listviewId);
        //setAdapter：布局
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, commonFunList));

        //setOnItemClickListener：监听点击了哪一条list
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Dialog alertDiaLog = new AlertDialog.Builder(Main7Activity.this).
                        setMessage("您点击了第" + i + "个item").create();
                alertDiaLog.show();

            }
        });
    }
}
