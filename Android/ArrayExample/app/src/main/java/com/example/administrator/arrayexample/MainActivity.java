package com.example.administrator.arrayexample;


import android.content.ContentValues;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button add;
    Button delete1;
    Button display;
    EditText text1;
    EditText text2;
    TextView text3;

    ArrayList<String> arrayList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add=findViewById(R.id.add);
        delete1=findViewById(R.id.delete);
        display=findViewById(R.id.display);
        text1=findViewById(R.id.text1);
        text3=findViewById(R.id.text3);

add.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        arrayList.add("hello");
       arrayList.add("world");
    }
});

delete1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        arrayList.remove(0);
    }
});
       display.setOnClickListener(new View.OnClickListener() {
 @Override
   public void onClick(View v) {
        for (int i=0; i< arrayList.size(); i++){
            // Log.d(TAG," gjgvg"+arrayList.get(i));
            text3.setText(text3.getText() + arrayList.get(i) + "  ");

        }
    }
});




   }
}
