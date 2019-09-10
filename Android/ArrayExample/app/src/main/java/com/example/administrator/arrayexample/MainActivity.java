package com.example.administrator.arrayexample;


import android.content.ContentValues;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button add;
    Button delete;
    Button display;
    EditText text1;
    EditText text2;
    EditText text3;

    private static final String TAG ="MainActivity";
    ArrayList<String> arrayList=new ArrayList<>();
  //  List<String> Values = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add.findViewById(R.id.add);
        delete.findViewById(R.id.delete);
        display.findViewById(R.id.display);
        text1.findViewById(R.id.text1);
        text3.findViewById(R.id.text3);

display.setOnClickListener(new View.OnClickListener() {
 @Override
   public void onClick(View v) {
        arrayList.add("hello");
        arrayList.add("world");


        for (int i=0; i< arrayList.size(); i++){
            // Log.d(TAG," gjgvg"+arrayList.get(i));
            text3.setText(text3.getText() + arrayList.get(i) + " , ");

        }
    }
});




   }
}
