package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myapplication.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "welcome", Toast.LENGTH_SHORT).show();

    }
    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
        // Do something in response to button
    }
    public void goMain2Activity(View view) {
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void goMain3Activity(View view) {
        Intent intent=new Intent(this,Main3Activity.class);
        startActivity(intent);
    }
    public void goMain4Activity(View view) {
        Intent intent=new Intent(this,Main4Activity.class);
        startActivity(intent);
    }
    public void goMain5Activity(View view) {
        Intent intent=new Intent(this,Main5Activity.class);
        startActivity(intent);
    }
    public void goMain6Activity(View view) {
        Intent intent=new Intent(this,Main6Activity.class);
        startActivity(intent);
    }
    public void goMain7Activity(View view) {
        Intent intent=new Intent(this,Main7Activity.class);
        startActivity(intent);
    }
    public void goMain8Activity(View view) {
        Intent intent=new Intent(this,Main8Activity.class);
        startActivity(intent);
    }

    public void goMain9Activity(View view) {
        Intent intent=new Intent(this,Main9Activity.class);
        startActivity(intent);
    }
    public void goMain10Activity(View view) {
        Intent intent=new Intent(this,Main10Activity.class);
        startActivity(intent);
    }
    public void goMain11Activity(View view) {
        Intent intent=new Intent(this,Main11Activity.class);
        startActivity(intent);
    }

}




