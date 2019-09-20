package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class RequestView extends AppCompatActivity {

    TextView items,date,status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_view);

        items=findViewById(R.id.items);
        date=findViewById(R.id.date);
        status=findViewById(R.id.status);


        Bundle requestBundle = getIntent().getBundleExtra("request");
        String requestNo = requestBundle.getString("RequestNo");
        String requestDescription = requestBundle.getString("RequestDescription");
        String requestStatus = requestBundle.getString("RequestStatus");

        items.setText(requestNo);
        date.setText(requestDescription);
        status.setText(requestStatus);

    }
}