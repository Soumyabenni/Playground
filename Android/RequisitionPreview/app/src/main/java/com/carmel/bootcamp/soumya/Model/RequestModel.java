package com.carmel.bootcamp.soumya.Model;

import java.io.Serializable;

public class RequestModel implements Serializable {

    String requestdescription;

    public String getRequestdescription() {
        return requestdescription;
    }

    public void setRequestdescription(String requestdescription) {
        this.requestdescription = requestdescription;
    }
}
