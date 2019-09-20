package com.example.listviewexample.Model;

import com.example.listviewexample.Global.RequestStatus;

import java.io.Serializable;

public class RequestModel implements Serializable {
    String requestNumber;
    RequestStatus requestStatus;
    String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
