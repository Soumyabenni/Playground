package com.example.fragmentsexample;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.fragmentsexample.Delegates.RequestDelegate;
import com.example.fragmentsexample.Global.RequestStatus;
import com.example.fragmentsexample.Model.Requestmodel;

import java.util.ArrayList;


public class RequestList extends Fragment {
ListView listView;
private View view;
 RequestDelegate requestDelegate;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.fragment_request_list, container, false);

        listView =view.findViewById(R.id.listView1);

        final ArrayList<Requestmodel> requestModels =new ArrayList<>();
        Requestmodel requestmodel = new Requestmodel();

        requestmodel.setRequestNumber("PUR - 2019 - 056");
        requestmodel.setDescription("06 Jul 2019");
        requestmodel.setRequestStatus(RequestStatus.APPROVED);
        requestModels.add(requestmodel);

        requestmodel = new Requestmodel();
        requestmodel.setRequestNumber("PUR - 2019 - 057");
        requestmodel.setDescription("07 Jul 2019");
        requestmodel.setRequestStatus(RequestStatus.AWAITING_APPROVAL);
        requestModels.add(requestmodel);

        requestmodel = new Requestmodel();
        requestmodel.setRequestNumber("PUR - 2019 - 058");
        requestmodel.setDescription("07 Aug 2019");
        requestmodel.setRequestStatus(RequestStatus.DRAFT);
        requestModels.add(requestmodel);

        requestmodel = new Requestmodel();
        requestmodel.setRequestNumber("PUR - 2019 - 059");
        requestmodel.setDescription("07 Sep 2019");
        requestmodel.setRequestStatus(RequestStatus.REJECTED);
        requestModels.add(requestmodel);

        ListAdapter adaptorfile=new Adaptorfile(view.getContext(),requestModels);
        listView.setAdapter(adaptorfile);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Requestmodel requestmodel=requestModels.get(i);
                if(requestDelegate != null){
                    requestDelegate.onClickRequestDelegate( requestmodel);
                }
            }
        });

        return view;
    }

    public void setRequestDelegate(RequestDelegate requestDelegate){
        this.requestDelegate = requestDelegate;
    }


}
