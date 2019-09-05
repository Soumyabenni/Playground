package com.example.administrator.activitylifecyce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
         Log.d("ActivityLifeCycle","Start Function Activated");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityLifeCycle","Resume Function Activated");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityLifeCycle","Restart Function Activated");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityLifeCycle","Pause Function Activated");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityLifeCycle","Stop Function Activated");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityLifeCycle","Destroy Function Activated");
    }
}
