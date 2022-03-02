package com.user.example.usercrudapi.advice;

import com.user.example.usercrudapi.dto.MetaDTO;
import com.user.example.usercrudapi.dto.ResponseDTO;
import com.user.example.usercrudapi.exceptions.MyException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyControllerAdvice {
    @ExceptionHandler(MyException.class)
    public ResponseEntity<ResponseDTO> handleEmptyInput(MyException myException) {
        ResponseDTO responseDTO=new ResponseDTO();
        MetaDTO metaDTO=new MetaDTO(myException.getErrorCode().getCode(),
                myException.getErrorCode().getMessage(),myException.getErrorCode().getDisplayMessage());
        responseDTO.setMeta(metaDTO);
        return new ResponseEntity<>(responseDTO,myException.getErrorCode().getStatus());

    }
}
