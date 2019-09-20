package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.example.listviewexample.Global.RequestStatus;
import com.example.listviewexample.Global.RequestStatus;
import com.example.listviewexample.Model.RequestModel;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView =findViewById(R.id.listView1);


        final ArrayList<RequestModel> requestModels =new ArrayList<>();
        RequestModel requestmodel = new RequestModel();


        requestmodel.setRequestNumber("PUR - 2019 - 056");
        requestmodel.setDescription("06 Jul 2019");
        requestmodel.setRequestStatus(RequestStatus.APPROVED);
        requestModels.add(requestmodel);

//        String S = requestmodel.getDescription();
//        System.out.println("tag" + S);

        requestmodel = new RequestModel();
        requestmodel.setRequestNumber("PUR - 2019 - 057");
        requestmodel.setDescription("07 Jul 2019");
        requestmodel.setRequestStatus(RequestStatus.AWAITING_ACTIVITY);
        requestModels.add(requestmodel);

        requestmodel = new RequestModel();
        requestmodel.setRequestNumber("PUR - 2019 - 058");
        requestmodel.setDescription("07 Aug 2019");
        requestmodel.setRequestStatus(RequestStatus.DRAFT);
        requestModels.add(requestmodel);

        requestmodel = new RequestModel();
        requestmodel.setRequestNumber("PUR - 2019 - 059");
        requestmodel.setDescription("07 Sep 2019");
        requestmodel.setRequestStatus(RequestStatus.REJECTED);
        requestModels.add(requestmodel);



        ListAdapter adaptorfile=new AdaptorFile(getApplicationContext(),requestModels);
        listView.setAdapter(adaptorfile);

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               RequestModel request = requestModels.get(i);


//String TempListView=requestModels.toString();
               Intent intent=new Intent(getApplicationContext(),RequestView.class);
               Bundle requestDataBundle = new Bundle();
               requestDataBundle.putString("RequestNo", request.getRequestNumber());
               requestDataBundle.putString("RequestDescription", request.getDescription());
               requestDataBundle.putString("RequestStatus", request.getRequestStatus().toString());

               intent.putExtra("request",requestDataBundle);
               startActivity(intent);
           }
       });
    }
}
