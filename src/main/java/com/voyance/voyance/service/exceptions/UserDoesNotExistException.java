package com.voyance.voyance.service.exceptions;

public class UserDoesNotExistException extends ApplicationException{
    public UserDoesNotExistException(String message) {
        super(message);
    }
}
