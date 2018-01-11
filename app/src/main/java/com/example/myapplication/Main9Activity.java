package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Main9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        Toast.makeText(getApplicationContext(), "LIST", Toast.LENGTH_SHORT).show();

        ExpandableListAdapter adapter = new BaseExpandableListAdapter() {

            private int[] logos = new int[]{
                    R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher
            };
            private String[] armTypes = new String[]{
                    "曹操", "刘备", "孙权"
            };
            private String[][] arms = new String[][]{
                    {"于禁", "许褚", "张颌", "张辽", "乐进", "徐晃", "典韦"},
                    {"关羽", "张飞", "赵子龙", "黄忠", "马超", "魏延", "姜维"},
                    {"周瑜", "太史慈", "甘宁", "黄盖", "程普", "吕蒙", "陆逊"}
            };


            @Override

            //section个数
            public int getGroupCount() {
                return armTypes.length;
            }

            //section数据源
            @Override
            public Object getGroup(int groupPosition) {
                return armTypes[groupPosition];
            }

            //sectionID
            @Override
            public long getGroupId(int groupPosition) {
                return groupPosition;
            }

            //section布局
            @Override
            public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
                LinearLayout ll = new LinearLayout(Main9Activity.this);
                ll.setOrientation(0);

                ImageView logo = new ImageView(Main9Activity.this);
                logo.setLayoutParams(new LinearLayoutCompat.LayoutParams(200, 200));
                logo.setImageResource(logos[groupPosition]);
                ll.addView(logo);

                TextView textView = new TextView(Main9Activity.this);
                textView.setLayoutParams(new ViewGroup.LayoutParams(800, 200));
                textView.setGravity(Gravity.CENTER | Gravity.LEFT);
                textView.setText(getGroup(groupPosition).toString());
                textView.setPadding(60, 0, 0, 0);
                textView.setTextSize(20);
                ll.addView(textView);
                return ll;
            }


            //row个数
            @Override
            public int getChildrenCount(int groupPosition) {
                return arms[groupPosition].length;
            }

            //row数据源
            @Override
            public Object getChild(int groupPosition, int childPosition) {
                return arms[groupPosition][childPosition];
            }

            //row ID
            @Override
            public long getChildId(int groupPosition, int childPosition) {
                return childPosition;
            }

            //row 布局
            @Override
            public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

                TextView textView = new TextView(Main9Activity.this);
                textView.setLayoutParams(new ViewGroup.LayoutParams(1000, 100));
                textView.setGravity(Gravity.CENTER | Gravity.LEFT);
                textView.setText(getChild(groupPosition, childPosition).toString());
                textView.setPadding(200, 0, 0, 0);
                textView.setTextSize(14);
                return textView;
            }


            @Override
            public boolean hasStableIds() {
                return true;
            }

            @Override
            public boolean isChildSelectable(int groupPosition, int childPosition) {
                return true;
            }
        };

        ExpandableListView expandableListView = (ExpandableListView) findViewById(R.id.expand);
        expandableListView.setAdapter(adapter);
    }
}