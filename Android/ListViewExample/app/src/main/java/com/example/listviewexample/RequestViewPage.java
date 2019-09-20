package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RequestViewPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_view_page);
//        Bundle requestBundle = getIntent().getBundleExtra("request");
//        String requestNo = requestBundle.getString("RequestNo");
    }
}
