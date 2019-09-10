package com.example.administrator.constructorexample;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class ConstructorA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    ConstructorA() {
    }


    public void Object1(Context applicationContext) {
        Toast.makeText(applicationContext, "This is Object",Toast.LENGTH_LONG).show();
    }
}
