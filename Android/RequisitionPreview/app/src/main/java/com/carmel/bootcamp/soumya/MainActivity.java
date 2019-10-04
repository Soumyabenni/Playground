package com.carmel.bootcamp.soumya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import com.carmel.bootcamp.soumya.Delegate.RequestDelegate;


public class MainActivity extends AppCompatActivity implements RequestDelegate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentPreview fragmentPreview = new FragmentPreview();
        fragmentPreview.setRequestDelegate(this);
        FragmentManager FragmentManager = getSupportFragmentManager();
        FragmentTransaction FragmentTransaction = FragmentManager.beginTransaction();
        FragmentTransaction.add(R.id.fragmentPlaceholder, fragmentPreview);
        FragmentTransaction.commit();


    }


    @Override
    public void onClickSubmit(RequestDelegate requestDelegate) {
        FragmentAcknowledgementRegistered fragmentAcknowledgementRegistered = new FragmentAcknowledgementRegistered();
        FragmentManager FragmentManager = getSupportFragmentManager();
        FragmentTransaction FragmentTransaction = FragmentManager.beginTransaction();
        FragmentTransaction.replace(R.id.fragmentPlaceholder, fragmentAcknowledgementRegistered);
        FragmentTransaction.addToBackStack(null);
        FragmentTransaction.commit();
    }

    @Override
    public void onClickSaveDraft(RequestDelegate requestDelegate) {
        FragmentAcknowledgementDraft fragmentAcknowledgementDraft= new FragmentAcknowledgementDraft();
        FragmentManager FragmentManager = getSupportFragmentManager();
        FragmentTransaction FragmentTransaction = FragmentManager.beginTransaction();
        FragmentTransaction.replace(R.id.fragmentPlaceholder, fragmentAcknowledgementDraft);
        FragmentTransaction.addToBackStack(null);
        FragmentTransaction.commit();
    }
}

