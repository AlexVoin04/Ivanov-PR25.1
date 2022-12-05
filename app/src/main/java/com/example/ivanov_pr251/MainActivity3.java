package com.example.ivanov_pr251;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void onClickStart(View v) {
        startService(new Intent("com.example.servicekiller.MyService3").putExtra("name", "value"));
    }
    public void startNewActivity (View v){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}