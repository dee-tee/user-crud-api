package com.user.example.usercrudapi.exceptions;

public class MyException extends Exception {
    private static final long serialVersionUID = 1L;

    private ErrorCode errorCode;
    private String errorMessage;



    public MyException(ErrorCode errorCode, String errorMessage) {
        this.errorCode=errorCode;
        this.errorMessage=errorMessage;
    }



    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }


    @Override
    public String getMessage() {
        return errorCode + " : " + errorMessage ;
    }

}
