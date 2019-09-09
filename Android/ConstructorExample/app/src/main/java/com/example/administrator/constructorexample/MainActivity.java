package com.example.administrator.constructorexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewbyId(R.id.button);
        button.SetOnClickListener(new View.OnClickListener()){
            public void Onclick(View View){
                ConstructorA A=new ConstructorA();
                A.Object1(getApplicationContext());
            }
        }

    }

}
