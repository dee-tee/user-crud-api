package com.user.example.usercrudapi.dto;

public class MetaDTO {
        private String code;
        private String message;
        private String displayMessage;
    public MetaDTO() {

    }

    public MetaDTO(String code, String message, String displayMessage) {
        this.code=code;
        this.message=message;
        this.displayMessage=displayMessage;

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


    public String getDisplayMessage() {
        return displayMessage;
    }

    public void setDisplayMessage(String displayMessage) {
        this.displayMessage = displayMessage;
    }
}
