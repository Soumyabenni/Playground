package com.example.fragmentsexample;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.fragmentsexample.Model.Requestmodel;

import java.util.ArrayList;


public class RequestView extends Fragment {

    TextView items,date,status;

    Requestmodel requestmodel;
    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_request_view, container, false);


        items=view.findViewById(R.id.itemsdescription);
        date=view.findViewById(R.id.date);
        status=view.findViewById(R.id.status);


        items.setText(requestmodel.getDescription());
        date.setText(requestmodel.getRequestNumber());
        status.setText(requestmodel.getRequestStatus().toString());


        return view;


    }

    public void setData(Requestmodel requestmodel) {
         this.requestmodel=requestmodel;

    }
}
