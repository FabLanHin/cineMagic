package com.metaphorce.FabianLanderos.cineMagic.Util;

import java.util.List;

public class ModelError {

    private String code;
    private String message;
    private List<String> list;

    public ModelError(String code, String message, List<String> list) {
        this.code = code;
        this.message = message;
        this.list = list;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
