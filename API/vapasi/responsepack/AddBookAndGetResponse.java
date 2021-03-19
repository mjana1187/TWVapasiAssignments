package com.tw.vapasi.responsepack;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddBookAndGetResponse {
    @JsonProperty("Msg")
    private String Msg;

    @JsonProperty("ID")
    private String id;

    public String getMsg() {
        return Msg;
    }
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}

