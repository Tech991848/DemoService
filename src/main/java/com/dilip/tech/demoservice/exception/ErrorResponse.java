package com.dilip.tech.demoservice.exception;

import lombok.Data;

import java.util.Date;
@Data
public class ErrorResponse {
    private String message;
    private String errorCode;
    private Date time;
}
