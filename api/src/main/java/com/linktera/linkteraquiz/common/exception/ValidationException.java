package com.linktera.linkteraquiz.common.exception;

public class ValidationException extends RuntimeException {

    public ValidationException(String errorMessage) {
        super(errorMessage);
    }
}
