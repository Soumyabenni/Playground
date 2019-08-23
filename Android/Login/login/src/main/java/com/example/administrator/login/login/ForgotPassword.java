package com.example.administrator.login.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.AlertDialog;


public class ForgotPassword extends AppCompatActivity {

    Button ContinueBtn;
    ImageView image1;
    ImageView image2;
    TextView errortext1;
    TextView errortext2;
    EditText editT;
    AlertDialog.Builder alertBuilder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        ContinueBtn = findViewById(R.id.ContinueBtn);
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        errortext1 = findViewById(R.id.errortext1);
        errortext2 = findViewById(R.id.errortext2);
        editT = findViewById(R.id.editT);

        alertBuilder=new AlertDialog.Builder(this);
        final View alertView=getLayoutInflater().inflate(R.layout.forgetalert,null);
        alertBuilder.setView(alertView);
        final AlertDialog alertDialog=alertBuilder.create();


        ContinueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editT.getText().toString().isEmpty()) {
                    image1.setVisibility(1);
                    errortext1.setVisibility(1);
                    image2.setVisibility(1);
                    errortext2.setVisibility(1);
                }else {
                    alertDialog.show();
                }
            }
        });


    }
}


