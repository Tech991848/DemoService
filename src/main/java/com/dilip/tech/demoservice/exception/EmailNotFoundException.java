package com.dilip.tech.demoservice.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmailNotFoundException extends Exception {

    public EmailNotFoundException() {
        super();
    }

    public EmailNotFoundException(String emailIdNotFound) {
        super(emailIdNotFound);
    }

    public EmailNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmailNotFoundException(Throwable cause) {
        super(cause);
    }

    protected EmailNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
