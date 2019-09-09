package com.example.administrator.aninterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements InterfaceA {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        demo();
    }
    public void demo(){
        Toast.makeText(getApplicationContext(),"Interface Started",Toast.LENGTH_LONG).show();
    }
}
