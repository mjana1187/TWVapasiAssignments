package com.tw.vapasi.responsepack;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteBookResponse {
    @JsonProperty("msg")
    private String msg;

    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
