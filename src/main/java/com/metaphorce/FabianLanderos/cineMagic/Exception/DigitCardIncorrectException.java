package com.metaphorce.FabianLanderos.cineMagic.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;

public class DigitCardIncorrectException extends RuntimeException{

    private String code;
    private HttpStatus status;
    private BindingResult result;

    public DigitCardIncorrectException(String message, String code, HttpStatus status, BindingResult result){
        super(message);

        this.code = code;
        this.status = status;
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public BindingResult getResult() {
        return result;
    }

    public void setResult(BindingResult result) {
        this.result = result;
    }
}
