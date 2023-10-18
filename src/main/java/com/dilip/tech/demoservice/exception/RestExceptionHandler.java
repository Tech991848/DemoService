package com.dilip.tech.demoservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class RestExceptionHandler{

   /* @ExceptionHandler(value= {IllegalArgumentException.class})
    @ResponseStatus(HttpStatus.FORBIDDEN)
    protected ErrorResponse errorHandler(IllegalArgumentException ex, WebRequest req){
        String responseString="Illeagal Argument";
        ErrorResponse error=new ErrorResponse();
        error.setErrorCode(""+HttpStatus.BAD_REQUEST);
        error.setMessage(responseString);
        error.setTime(new Date());
        return error;
    }*/

    @ExceptionHandler(value= {MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    protected Map<String,String> errorReqiestHandler(MethodArgumentNotValidException ex){
        Map<String,String> errorMap=new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error-> {
            errorMap.put(error.getField(),error.getDefaultMessage());
        });
        return errorMap;
    }

    @ExceptionHandler(value= {IOException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    protected Map<String,String> errorInternalServerHandler(IOException ex){
        Map<String,String> errorMap=new HashMap<>();
errorMap.put("errorMessage",ex.getMessage());

        /*String responseString="internal Server Error";
        ErrorResponse error=new ErrorResponse();
        error.setErrorCode(""+HttpStatus.INTERNAL_SERVER_ERROR);
        error.setMessage(responseString);
        error.setTime(new Date());*/
        return errorMap;
    }

    @ExceptionHandler(value= {EmailNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    protected Map<String,String> errorHandler(EmailNotFoundException ex){
        Map<String,String> errorMap=new HashMap<>();
        errorMap.put("errorMessage",ex.getMessage());
        /*String responseString="Email Id not Found";
        ErrorResponse error=new ErrorResponse();
        error.setErrorCode(""+HttpStatus.NOT_FOUND);
        error.setMessage(responseString);
        error.setTime(new Date());*/
        return errorMap;
    }

}
