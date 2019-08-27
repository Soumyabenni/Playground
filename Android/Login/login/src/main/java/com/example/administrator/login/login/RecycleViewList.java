package com.example.administrator.login.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import static com.example.administrator.login.login.R.id.recyclerview;

public class RecycleViewList extends AppCompatActivity {
    RecyclerView recyclerView = findViewById(R.id.recyclerview);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);


        String title[]={"Rose","Lotus","Jasmine","RCB","Bengularu Bulls"};
        String date[]={"22-Aug","24-Aug","28-Aug","30-Aug","2-Sep"};
        String status[]={"APPROVED","REJECTED","DRAFT","AWAITING","COMPLETED"};

        MyRecyclerListAdapter myRecyclerListAdapter=new MyRecyclerListAdapter(getApplicationContext(),title,date,status);

recyclerView.setAdapter(myRecyclerListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    private void setItemAnimator(DefaultItemAnimator defaultItemAnimator) {
    }

    private void setLayoutManager(LinearLayoutManager linearLayoutManager) {
    }

    private void setAdapter(MyRecyclerListAdapter myRecyclerListAdapter) {
    }


}
