package com.example.fragmentsexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import com.example.fragmentsexample.Delegates.RequestDelegate;
import com.example.fragmentsexample.Model.Requestmodel;


public class MainActivity extends AppCompatActivity implements RequestDelegate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestList requestList=new RequestList();
        requestList.setRequestDelegate(this);
        FragmentManager FragmentManager=getSupportFragmentManager();
        FragmentTransaction FragmentTransaction=FragmentManager.beginTransaction();
        FragmentTransaction.add(R.id.frame1,requestList);
        FragmentTransaction.commit();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration .ORIENTATION_LANDSCAPE){
            RequestView requestView=new RequestView();
            FragmentManager FragmentManager=getSupportFragmentManager();
            FragmentTransaction FragmentTransaction=FragmentManager.beginTransaction();
            FragmentTransaction.replace(R.id.linear2,requestView);
            FragmentTransaction.addToBackStack(null);
            FragmentTransaction.commit();
        }
        else if(newConfig.orientation == Configuration .ORIENTATION_PORTRAIT){
            RequestView requestView=new RequestView();
            FragmentManager FragmentManager=getSupportFragmentManager();
            FragmentTransaction FragmentTransaction=FragmentManager.beginTransaction();
            FragmentTransaction.replace(R.id.frame1,requestView);
            FragmentTransaction.addToBackStack(null);
            FragmentTransaction.commit();
        }
        else{
            RequestView requestView=new RequestView();
            FragmentManager FragmentManager=getSupportFragmentManager();
            FragmentTransaction FragmentTransaction=FragmentManager.beginTransaction();
            FragmentTransaction.replace(R.id.linear2,requestView);
            FragmentTransaction.addToBackStack(null);
            FragmentTransaction.commit();
        }
    }

    @Override
    public void onClickRequestDelegate(Requestmodel requestmodel) {

        int newConfig =this.getResources().getConfiguration().orientation;
        if(newConfig == Configuration.ORIENTATION_PORTRAIT){
            RequestView requestView=new RequestView();
            FragmentManager FragmentManager=getSupportFragmentManager();
            FragmentTransaction FragmentTransaction=FragmentManager.beginTransaction();
            FragmentTransaction.replace(R.id.frame1,requestView);
            FragmentTransaction.addToBackStack(null);
            FragmentTransaction.commit();

            requestView.setData(requestmodel);

        }

        else
            {
            RequestView requestView=new RequestView();
            FragmentManager FragmentManager=getSupportFragmentManager();
            FragmentTransaction FragmentTransaction=FragmentManager.beginTransaction();
            FragmentTransaction.replace(R.id.linear2,requestView);
            FragmentTransaction.addToBackStack(null);
            FragmentTransaction.commit();

            requestView.setData(requestmodel);

        }

    }

}
