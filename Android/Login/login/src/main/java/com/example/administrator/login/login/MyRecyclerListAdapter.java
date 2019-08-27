package com.example.administrator.login.login;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



public class MyRecyclerListAdapter extends RecyclerView.Adapter {
    String titles[], dates[], status[];
    private Context context;

    public MyRecyclerListAdapter(Context context, String[] title, String[] date, String[] statusTxt) {
        this.context = context;
        this.titles = title;
        this.dates = date;
        this.status = statusTxt;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    public int getItemCount() {
        return titles.length;
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, date, statusText;
        public ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            date = itemView.findViewById(R.id.date);
          statusText=itemView.findViewById(R.id.status);
//            imageView = itemView.findViewById(R.id.view);
        }

        public void setUpData(String titles, String dates, String status) {
            title.setText(titles);
            date.setText(dates);
            statusText.setText(status);
//            imageView.setImageResource(R.drawable.cancel);
        }
    }
}

