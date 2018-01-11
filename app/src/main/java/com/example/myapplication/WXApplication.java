package com.example.myapplication;


import android.app.Application;
import android.widget.Toast;

import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;

/**
 * Created by leweili on 11/01/2018.
 */

public class WXApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        InitConfig.Builder builder = new InitConfig.Builder();
        builder.setImgAdapter(new ImageAdapter());
        Toast.makeText(getApplicationContext(), "WXApplication", Toast.LENGTH_SHORT).show();

        InitConfig config = builder.build();
        WXSDKEngine.initialize(this, config);
    }
}
