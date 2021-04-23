package com.linktera.linkteraquiz.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomRestApiExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {ValidationException.class})
    public ResponseEntity<Object> handleApiRequestException(ValidationException e) {
        HttpStatus badRequest = HttpStatus.BAD_REQUEST;

        ApiException apiException = new ApiException(e.getMessage(), badRequest);
        return new ResponseEntity<>(apiException, badRequest);
    }

    public static void main(String[] args) {
        System.out.println(topla(8, 17));
    }
}
