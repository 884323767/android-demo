package com.example.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {

    private Button loginBtn;
    private EditText userName;
    private EditText passWord;
    private RadioGroup radioGroup;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Toast.makeText(getApplicationContext(), "page6", Toast.LENGTH_SHORT).show();

        userName = (EditText) findViewById(R.id.username);
        passWord = (EditText) findViewById(R.id.password);

        //给radioGroup添加点击事件
        radioGroup = (RadioGroup) findViewById(R.id.rg);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                //通过getCheckedRadioButtonId（）获取点击的radiobutton
                int rgId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(rgId);
            }
        });
        //点击登录
        loginBtn = (Button) findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //通过getText（）获取控件值
                String usernameStr = userName.getText().toString();
                String passwordStr = passWord.getText().toString();
//                String loginTypeStr = radioButton.getText().toString();
//                if (loginTypeStr.equals("个人登录")) {
//                    //alert提示框
//                    Dialog alertDialog = new AlertDialog.Builder(Main6Activity.this).
//                            setTitle("登录状态").
//                            setMessage("成功！").
//                            create();
//                    alertDialog.show();
//                } else {
                    Dialog alertDialog = new AlertDialog.Builder(Main6Activity.this).
                            setTitle("法人登录状态").
                            setMessage("失败！").
                            create();
                    alertDialog.show();
//                }
            }
        });

    }
}
