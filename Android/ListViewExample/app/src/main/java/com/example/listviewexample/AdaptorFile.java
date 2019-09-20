package com.example.listviewexample;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listviewexample.Model.RequestModel;

import java.util.ArrayList;

class AdaptorFile extends BaseAdapter {
    private Context context;
    ArrayList<RequestModel> requestModel;

    public AdaptorFile(Context context, ArrayList<RequestModel> requestModels) {
    this.context=context;
    this.requestModel=requestModels;
    }

    @Override
    public int getCount() {
        return requestModel.size();
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

        TextView items,dates,approval;
        ImageView notificationimage;

        items=view1.findViewById(R.id.items);
        dates=view1.findViewById(R.id.date);
        approval=view1.findViewById(R.id.approved);
        notificationimage=view1.findViewById(R.id.notification);

        RequestModel requestModel = this.requestModel.get(i);
        items.setText(String.valueOf(requestModel.getRequestNumber()));
        dates.setText(String.valueOf(requestModel.getDescription()));
        approval.setText(String.valueOf(requestModel.getRequestStatus()));
        notificationimage.setImageResource(R.drawable.notification);

   return view1;
    }
}
