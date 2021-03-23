package com.sbs.mobilebank.exception;

public class UserServiceException extends RuntimeException{
    public UserServiceException(String message)
    {
        super(message);
    }
}
