package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


import com.example.listviewexample.Model.RequestModel;

public class RequestView extends AppCompatActivity {

   // TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_view);
        Bundle requestBundle = getIntent().getBundleExtra("request");
        String requestNo = requestBundle.getString("RequestNo");

    }
}