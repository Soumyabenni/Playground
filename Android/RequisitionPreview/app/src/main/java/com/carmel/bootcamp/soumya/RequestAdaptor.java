package com.carmel.bootcamp.soumya;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.carmel.bootcamp.soumya.Model.RequestModel;
import java.util.ArrayList;

public class RequestAdaptor extends BaseAdapter {

    private Context context;
    ArrayList<RequestModel> requestModels;
    TextView itemsdescription;


    public RequestAdaptor(Context context, ArrayList<RequestModel> requestModels) {
        this.context = context;
        this.requestModels = requestModels;

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
        View previewlistitems = LayoutInflater.from(context).inflate(R.layout.previewlistitems,viewGroup,false);

        itemsdescription = previewlistitems.findViewById(R.id.itemsdescription);

        RequestModel requestModel = this.requestModels.get(i);
        itemsdescription.setText(String.valueOf(requestModel.getRequestdescription()));

        return previewlistitems;
    }
}
