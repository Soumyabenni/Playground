package com.example.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class AdaptorFile extends BaseAdapter {
    ArrayList<String> arrayslist,arraysList1,arraysList2;
private Context context;

    public AdaptorFile(Context context, ArrayList<String> arrayList, ArrayList<String> arrayList1, ArrayList<String> arrayList2) {
this.context=context;
this.arrayslist=arrayList;
this.arraysList1=arrayList1;
this.arraysList2=arrayList2;
    }

    @Override
    public int getCount() {
        return arrayslist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1= LayoutInflater.from(context).inflate(R.layout.listitems,viewGroup,false);

        TextView textView,textView1,textView2;
        ImageView imageView;

textView=view1.findViewById(R.id.textView);
textView1=view1.findViewById(R.id.textView3);
textView2=view1.findViewById(R.id.textView4);
imageView=view1.findViewById(R.id.notification);

textView.setText(arrayslist.get(i));
textView1.setText(arraysList1.get(i));
textView2.setText(arraysList2.get(i));
imageView.setImageResource(R.drawable.notification);


        return view1;
    }
}
