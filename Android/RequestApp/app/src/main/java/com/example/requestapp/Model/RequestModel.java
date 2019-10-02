package com.example.requestapp.Model;

import com.example.requestapp.Global.RequestStatus;

import java.io.Serializable;

public class RequestModel implements Serializable {
            String requestNumber;
            RequestStatus requestStatus;
            String requestdescription;

    public String getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
    }

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getRequestdescription() {
        return requestdescription;
    }

    public void setRequestdescription(String requestdescription) {
        this.requestdescription = requestdescription;
    }

}
