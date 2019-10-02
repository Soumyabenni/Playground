package com.example.requestapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.requestapp.Delegate.RequestDelegate;
import com.example.requestapp.Global.RequestStatus;
import com.example.requestapp.Model.RequestModel;

import java.util.ArrayList;

public class RequestList extends Fragment {

   private View view;
   ListView listView;
   RequestDelegate requestDelegate;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       view =  inflater.inflate(R.layout.fragment_request_list, container, false);

       listView =view.findViewById(R.id.listView1);

       final ArrayList<RequestModel> requestModels =new ArrayList<>();

       RequestModel requestModel = new RequestModel();
       requestModel.setRequestNumber("PUR - 2019 - 056");
       requestModel.setRequestdescription("06 Jul 2019");
       requestModel.setRequestStatus(RequestStatus.APPROVED);
       requestModels.add(requestModel);

        requestModel = new RequestModel();
        requestModel.setRequestNumber("PUR - 2019 - 057");
        requestModel.setRequestdescription("07 Jul 2019");
        requestModel.setRequestStatus(RequestStatus.AWAITING_APPROVAL);
        requestModels.add(requestModel);

        requestModel = new RequestModel();
        requestModel.setRequestNumber("PUR - 2019 - 058");
        requestModel.setRequestdescription("05 Aug 2019");
        requestModel.setRequestStatus(RequestStatus.DRAFT);
        requestModels.add(requestModel);

        requestModel = new RequestModel();
        requestModel.setRequestNumber("PUR - 2019 - 059");
        requestModel.setRequestdescription("10 Sept 2019");
        requestModel.setRequestStatus(RequestStatus.REJECTED);
        requestModels.add(requestModel);

        ListAdapter adapter = new RequestAdaptor(view.getContext(),requestModels);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                RequestModel requestModel=requestModels.get(i);
                if(requestDelegate != null){
                    requestDelegate.onClickRequestDelegate(requestModel);
                }
            }
        });

        return view;
    }

    public void setRequestDelegate(RequestDelegate requestDelegate) {
      this.requestDelegate = requestDelegate;
    }
}
