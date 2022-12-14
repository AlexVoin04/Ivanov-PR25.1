package com.example.ivanov_pr251;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    final String LOG_TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickStart(View v) {
        startService(new Intent(this, MyService.class));
    }

    public void onClickStop(View v) {
        stopService(new Intent(this, MyService.class));
    }

    public void startNewActivity (View v){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}