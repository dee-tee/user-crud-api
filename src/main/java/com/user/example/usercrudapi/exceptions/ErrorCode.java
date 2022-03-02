package com.user.example.usercrudapi.exceptions;


import org.springframework.http.HttpStatus;

public enum ErrorCode {



    EMPTY_NAME("EMPTY_FIELD_NAME",
            "Bad Request",
            "Name cannot be empty, enter valid name",
            HttpStatus.BAD_REQUEST),
    INVALID_PHONE_NUMBER("INVALID_PHONE_NUMBER", "Bad Request","Enter a valid phone number",HttpStatus.BAD_REQUEST),
    DOES_NOT_EXIST("USER_NOT_FOUND", "Not Found","No such user exists, Try again.",HttpStatus.NOT_FOUND),
    EMPTY_RECORDS("EMPTY_LIST", "Not Found","Empty User Records",HttpStatus.NOT_FOUND);
    private final String code;
    private final String message;
    private final String displayMessage;
    private final HttpStatus status;
    ErrorCode(String code, String message,String displayMessage,HttpStatus status) {
        this.code = code;
        this.message = message;
        this.displayMessage = displayMessage;
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    public String toString() {
        return code;
    }
    public String getDisplayMessage(){return this.displayMessage;}
}
