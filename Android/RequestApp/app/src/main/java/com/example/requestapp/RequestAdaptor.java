package com.example.requestapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.requestapp.Model.RequestModel;

import java.util.ArrayList;

public class RequestAdaptor extends BaseAdapter {

    ArrayList<RequestModel> requestModels;
    TextView items,status,date;
    ImageView notification;
    private Context context;

    public RequestAdaptor(Context context, ArrayList<RequestModel> requestModels) {
        this.context=context;
        this.requestModels=requestModels;
    }

    @Override
    public int getCount() {
        return requestModels.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1= LayoutInflater.from(context).inflate(R.layout.listitems,viewGroup,false);

        items=view1.findViewById(R.id.itemsdescription);
        date=view1.findViewById(R.id.date);
        status=view1.findViewById(R.id.approved);
        notification=view1.findViewById(R.id.notification);

        RequestModel requestModel= this.requestModels.get(i);
        items.setText(String.valueOf(requestModel.getRequestNumber()));
        date.setText(String.valueOf(requestModel.getRequestdescription()));
        status.setText(String.valueOf(requestModel.getRequestStatus()));
        notification.setImageResource(R.drawable.notification);


        return view1;
    }
}
