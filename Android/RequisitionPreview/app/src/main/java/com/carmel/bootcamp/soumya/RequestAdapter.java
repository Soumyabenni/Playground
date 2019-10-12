package com.carmel.bootcamp.soumya;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.carmel.bootcamp.soumya.Model.RequestModel;
import java.util.ArrayList;

public class RequestAdapter extends BaseAdapter {

    private Context context;
    ArrayList<RequestModel> requestModels;
    TextView itemsdescription;


    public RequestAdapter(Context context, ArrayList<RequestModel> requestModels) {
        this.context = context;
        this.requestModels = requestModels;
    }

    @Override
    public int getCount() {
        Log.d("TAG","getcount " +requestModels.size());
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
        View previewListItems = LayoutInflater.from(context).inflate(R.layout.previewlistitems,viewGroup,false);

        itemsdescription = previewListItems.findViewById(R.id.itemsdescription);

        RequestModel requestModel = this.requestModels.get(i);
        itemsdescription.setText(String.valueOf(requestModel.getRequestdescription()));

        return previewListItems;
    }
}
