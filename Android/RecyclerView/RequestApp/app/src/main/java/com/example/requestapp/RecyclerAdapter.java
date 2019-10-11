package com.example.requestapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.requestapp.Model.RequestModel;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class RecyclerAdapter extends RecyclerView.Adapter {
    private Context context;
    private ArrayList<RequestModel> requestModels;
    public RecyclerAdapter(Context context, ArrayList<RequestModel> requestModels) {
        this.context = context;
        this.requestModels = requestModels;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.listitems,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        RecyclerAdapter.MyViewHolder myViewHolder= (RecyclerAdapter.MyViewHolder)holder;
        RequestModel requestModel = this.requestModels.get(position);
        myViewHolder.setUpData(requestModel);

    }

    @Override
    public int getItemCount() {
        return requestModels.size();
    }


    private class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView items,date,status;
        public ImageView notification;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);


            items=itemView.findViewById(R.id.itemsdescription);
            date=itemView.findViewById(R.id.date);
            status=itemView.findViewById(R.id.approved);
            notification=itemView.findViewById(R.id.notification);
        }

        public void setUpData(RequestModel requestModel) {
            items.setText(String.valueOf(requestModel.getRequestNumber()));
            date.setText(String.valueOf(requestModel.getRequestdescription()));
            status.setText(String.valueOf(requestModel.getRequestStatus()));
            notification.setImageResource(R.drawable.notification);


        }
    }
}
