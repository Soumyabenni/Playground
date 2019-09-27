package com.example.fragmentsexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fragmentsexample.Model.Requestmodel;

import java.util.ArrayList;

public class Adaptorfile extends BaseAdapter {
    private Context context;
    ArrayList<Requestmodel> requestModel;

    public Adaptorfile(Context context, ArrayList<Requestmodel> requestModels) {
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

        items=view1.findViewById(R.id.itemsdescription);
        dates=view1.findViewById(R.id.date);
        approval=view1.findViewById(R.id.approved);
        notificationimage=view1.findViewById(R.id.notification);

        Requestmodel requestModel = this.requestModel.get(i);
        items.setText(String.valueOf(requestModel.getRequestNumber()));
        dates.setText(String.valueOf(requestModel.getDescription()));
        approval.setText(String.valueOf(requestModel.getRequestStatus()));
        notificationimage.setImageResource(R.drawable.notification);

        return view1;
    }
}
