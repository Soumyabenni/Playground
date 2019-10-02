package com.example.requestapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;

import com.example.requestapp.Delegate.RequestDelegate;
import com.example.requestapp.Model.RequestModel;

public class MainActivity extends AppCompatActivity implements RequestDelegate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestList requestList = new RequestList();
        requestList.setRequestDelegate(this);
        FragmentManager FragmentManager = getSupportFragmentManager();
        FragmentTransaction FragmentTransaction = FragmentManager.beginTransaction();
        FragmentTransaction.add(R.id.frame1,requestList);
        FragmentTransaction.commit();

    }

    @Override
    public void onClickRequestDelegate(RequestModel requestModel) {
        int newConfig =this.getResources().getConfiguration().orientation;
        if(newConfig == Configuration.ORIENTATION_PORTRAIT){

        RequestView requestView = new RequestView();

        FragmentManager FragmentManager = getSupportFragmentManager();
        FragmentTransaction FragmentTransaction = FragmentManager.beginTransaction();
        FragmentTransaction.replace(R.id.frame1,requestView);
        FragmentTransaction.addToBackStack(null);
        FragmentTransaction.commit();

        requestView.setData(requestModel);
    }
        else if(newConfig == Configuration.ORIENTATION_LANDSCAPE) {
            RequestView requestView = new RequestView();

            FragmentManager FragmentManager = getSupportFragmentManager();
            FragmentTransaction FragmentTransaction = FragmentManager.beginTransaction();
            FragmentTransaction.replace(R.id.frame2,requestView);
            FragmentTransaction.addToBackStack(null);
            FragmentTransaction.commit();

            requestView.setData(requestModel);
        }
        else {
            RequestView requestView = new RequestView();

            FragmentManager FragmentManager = getSupportFragmentManager();
            FragmentTransaction FragmentTransaction = FragmentManager.beginTransaction();
            FragmentTransaction.replace(R.id.frame1,requestView);
            FragmentTransaction.addToBackStack(null);
            FragmentTransaction.commit();

            requestView.setData(requestModel);
        }

//    public void onConfigurationChanged(Configuration newConfig) {
//        super.onConfigurationChanged(newConfig);
//        if (newConfig.orientation == Configuration .ORIENTATION_LANDSCAPE){
//            RequestView requestView=new RequestView();
//            FragmentManager FragmentManager=getSupportFragmentManager();
//            FragmentTransaction FragmentTransaction=FragmentManager.beginTransaction();
//            FragmentTransaction.replace(R.id.frame2,requestView);
//            FragmentTransaction.addToBackStack(null);
//            FragmentTransaction.commit();
//        }
//        else if(newConfig.orientation == Configuration .ORIENTATION_PORTRAIT){
//            RequestView requestView=new RequestView();
//            FragmentManager FragmentManager=getSupportFragmentManager();
//            FragmentTransaction FragmentTransaction=FragmentManager.beginTransaction();
//            FragmentTransaction.replace(R.id.frame1,requestView);
//            FragmentTransaction.addToBackStack(null);
//            FragmentTransaction.commit();
//        }
//        else{
//            RequestView requestView=new RequestView();
//            FragmentManager FragmentManager=getSupportFragmentManager();
//            FragmentTransaction FragmentTransaction=FragmentManager.beginTransaction();
//            FragmentTransaction.replace(R.id.frame2,requestView);
//            FragmentTransaction.addToBackStack(null);
//            FragmentTransaction.commit();
//        }
    }

}
