package com.example.requestapp;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.requestapp.Model.RequestModel;


public class RequestView extends Fragment {

    TextView items,status,date;
    RequestModel requestModel;
    private  View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       view = inflater.inflate(R.layout.fragment_request_view, container, false);

        items=view.findViewById(R.id.itemsdescription);
        date=view.findViewById(R.id.date);
        status=view.findViewById(R.id.status);

        if (requestModel != null) {

            items.setText(requestModel.getRequestdescription());
            date.setText(requestModel.getRequestNumber());
            status.setText(requestModel.getRequestStatus().toString());
        }
return  view;
    }
    public void setData(RequestModel requestModel) {
        this.requestModel=requestModel;
    }

}
