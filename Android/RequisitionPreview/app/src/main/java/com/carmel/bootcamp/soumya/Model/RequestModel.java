package com.carmel.bootcamp.soumya.Model;

import java.io.Serializable;

public class RequestModel implements Serializable {

    String requestDescription;

    public RequestModel(String requestdescription) {
        requestDescription = requestdescription;
    }

    public String getRequestdescription() {
        return requestDescription;
    }

    public void setRequestdescription(String requestdescription) {
        this.requestDescription = requestdescription;
    }
}
