package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main10Activity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        Toast.makeText(getApplicationContext(), "webview", Toast.LENGTH_SHORT).show();

        Button b1 = (Button) findViewById(R.id.button12);
        final EditText et = (EditText) findViewById(R.id.editText10);

        //定义UI组件
        webView = (WebView) findViewById(R.id.webview);
        //得到WebSetting对象，设置支持Javascript的参数
        webView.getSettings().setJavaScriptEnabled(true);
        //设置可以支持缩放

        webView.getSettings().setSupportZoom(true);
        //设置出现缩放工具

        webView.getSettings().setBuiltInZoomControls(true);
        //载入URL
        webView.loadUrl("http://www.baidu.com");
        //使页面获得焦点
        webView.requestFocus();

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return super.shouldOverrideUrlLoading(view, url);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //访问编辑框中的网址
                webView.loadUrl("http://" + et.getText().toString());
            }
        });
    }

    public void back(View view) {
        webView.goBack();
    }

    public void forword(View view) {
        webView.goForward();
    }

    public void reload(View view) {
        webView.reload();
    }
}
