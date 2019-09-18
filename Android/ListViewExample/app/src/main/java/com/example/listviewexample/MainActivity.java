package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    ArrayList<String> arrayList,arrayList1,arrayList2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =findViewById(R.id.listView1);


        arrayList=new ArrayList<>();
        arrayList1=new ArrayList<>();
        arrayList2=new ArrayList<>();

arrayList.add("PUR - 2019 - 056");
arrayList.add("PUR - 2019 - 057");
arrayList.add("PUR - 2019 - 058");

arrayList1.add("06 Jul 2019");
arrayList1.add("06 Aug 2019");
arrayList1.add("06 sep 2019");

arrayList2.add("APPROVED");
arrayList2.add("REJECTED");
arrayList2.add("DRAFT");

        ListAdapter adaptorfile=new AdaptorFile(getApplicationContext(),arrayList,arrayList1,arrayList2);
        listView.setAdapter(adaptorfile);




    }
}
