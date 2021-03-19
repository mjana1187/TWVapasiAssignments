package com.tw.vapasi.requestpack;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteBookRequest {
    @JsonProperty("ID")
    private String ID;

    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }

}
