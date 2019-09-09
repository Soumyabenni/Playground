package com.example.administrator.constructorexample;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class ConstructorA extends AppCompactActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstructorA(){
   // Toast.makeText(getApplication.Context(),"Constructor created");
}
public void object1(Context applicationContext){
            Toast.makeText(applicationContext ,"This is Object", Toast,Length_Long).show();
        }
}
