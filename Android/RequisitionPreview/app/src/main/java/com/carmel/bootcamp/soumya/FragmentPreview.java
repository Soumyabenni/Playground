package com.carmel.bootcamp.soumya;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.carmel.bootcamp.soumya.Delegate.RequestDelegate;
import com.carmel.bootcamp.soumya.Model.RequestModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;


public class FragmentPreview extends Fragment {

    private View view;
    ListView listView;
    Button submitButton;
    TextView savedraft;
    RequestDelegate requestDelegate;
    ArrayList<RequestModel> requestModels;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_preview, container, false);

        listView = view.findViewById(R.id.listView1);
        submitButton = view.findViewById(R.id.submitButton);
        savedraft = view.findViewById(R.id.savedraft);

        requestModels =new ArrayList<>();
        getjson();
//        final ArrayList<RequestModel> requestModels = new ArrayList<>();
//        RequestModel requestModel = new RequestModel();
//
//        requestModel.setRequestdescription("IBM ThinkServer TS150 Tower Server With Max. Processor 1 x Intel Xeon E3 (Quad Core) E3-1225 v5\"(3.3 GHz /Cache 8 MB)... / STD MEMORY 8GB X 1/ MAX. MEMORY 64GB 4 Slots/HARD DRIVE 1 X 1TB SATA 3.5\" 7.2k SATA / STD. " +
//                "HDD BAY/ 3 bay MAX. HDD BAY upto 4 x 3.5\" +1 x 2.5\" bay/ OPTICAL Multi Burner/Integrated RAID 0,1,5,10 (RAID 121i).");
//        requestModels.add(requestModel);
//
//
//        requestModel = new RequestModel();
//        requestModel.setRequestdescription("Lenovo ThinkServer TS450 (PN:70M2001VIH) With Max. Processor 1 x Intel Xeon E3 (Quad Core) E3-1225 v5”(3.3 GHz /Cache 8 MB)/ STD MEMORY 8GB X 1 MAX. MEMORY 64GB; 4 DIMM Memory Slots/ HARD DRIVE Open Bay/ 2.5” SAS/SATA HS Bays (8 bay MAX. HDD BAY upto 8 x 2.5” bay MAX. HDD BAY upto 16x2.5”)/OPTICAL Multi Burner/ " +
//                "PCIe RAID 0,1,10 (RAID 520i). Supports SAS & SATA drives/Power Supply Standard (Inbuilt) 1 x 450W Power Supply /Max: 2");
//        requestModels.add(requestModel);
//
//        requestModel = new RequestModel();
//        requestModel.setRequestdescription("IBM X3300M4 Server With x3300M4/ Part NO:7382IA4/ Intel Xeon E5 1230v2 1.8 GHz,10 MB,1066MHz/" +
//                " 1x 8GB RAM/ 1x500GB SATA HDD/ 3.5Simple-Swap/ MULTI BUTRNER");
//        requestModels.add(requestModel);
//
//        requestModel = new RequestModel();
//        requestModel.setRequestdescription("IBM Lenovo ThinkServer RD450 Rack Server (PN:70Q90059IH) with 1 x Intel® Xeon® E5-2620v4 (2.1GHz/8C/20MB/85W/2133Mhz)/Max: 2 Processors/ STD MEMORY 16GB X 1 MAX. MEMORY 1 TB ;16 Slots/ HARD DRIVE : Open Bay (2.5” HOT Swap SAS/SATA STD. HDD BAY 8 bay / MAX. HDD BAY 16 bay with optical bay/24 bay without optical bay) / OPTICAL Multi Burner/ Integrated" +
//                " RAID 0,1,10 (RAID 110i). Supports only SATA drive/ Power Supply Standard (Inbuilt) 1 x 750W Power Supply Max: 2");
//        requestModels.add(requestModel);
//
//        requestModel = new RequestModel();
//        requestModel.setRequestdescription("daptec 128 MB Raid Controller Pair. Pci-e SAS/SATA");
//        requestModels.add(requestModel);

        ListAdapter adapter = new RequestAdapter(view.getContext(), requestModels);
        listView.setAdapter(adapter);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (requestDelegate != null) {
                    requestDelegate.onClickSubmit(requestDelegate);
                }
            }
        });

        savedraft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(requestDelegate != null){
                    requestDelegate.onClickSaveDraft(requestDelegate);
                }
            }
        });

        return view;
    }

    public void setRequestDelegate(RequestDelegate requestDelegate) {
        this.requestDelegate = requestDelegate;
    }

    public void getjson(){
        String json;

        try {
            InputStream inputStream = getActivity().getAssets().open("previewItemsList.json");
            int size = inputStream.available();
            byte[] buffer =new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json = new String(buffer,"UTF-8");
            Log.d("TAG","JSON " +json);
            JSONArray jsonArray =new JSONArray(json);

            for( int i=0;i<jsonArray.length();i++){
                JSONObject object = jsonArray.getJSONObject(i);
                String Requestdescription = object.optString("Requestdescription");
                requestModels.add(new RequestModel(Requestdescription));
            }
//            Log.d("TAG","ABCD " +requestModels.size());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
