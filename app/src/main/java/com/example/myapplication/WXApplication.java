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
        // Code comes form: https://github.com/weexteam/article/issues/25
        InitConfig config = new InitConfig.Builder().setImgAdapter(new ImageAdapter()).build();
        WXSDKEngine.initialize(this,config);
    }
}
