package com.carmel.bootcamp.soumya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentPreview fragmentPreview = new FragmentPreview();
        FragmentManager FragmentManager = getSupportFragmentManager();
        FragmentTransaction FragmentTransaction = FragmentManager.beginTransaction();
        FragmentTransaction.add(R.id.fragmentPlaceholder, fragmentPreview);
       // FragmentTransaction.addToBackStack(null);
        FragmentTransaction.commit();


    }


}
