package com.example.administrator.login.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView t1;
    TextView t2;
    ImageView w1;
    ImageView w2;
    TextView f1;
    EditText username;
    EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button=findViewById(R.id.buttonLogin);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        w1=findViewById(R.id.w1);
        w2=findViewById(R.id.w2);
        f1=findViewById(R.id.f1);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);


f1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(getApplicationContext(),ForgotPassword.class);
        startActivity(intent);


    }
});
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("") || password.getText().toString().equals("")){
                t1.setVisibility(1);
                t2.setVisibility(1);
                w1.setVisibility(1);
                w2.setVisibility(1);
            }
            else{
                    Intent intent=new Intent(getApplicationContext(),BugerMenu.class);
                    startActivity(intent);
                }
        }

        });
    }
}
