package com.linktera.linkteraquiz.common.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ApiException {

    private String errorMessage;
    private HttpStatus httpStatus;

    public ApiException(String errorMessage, HttpStatus httpStatus) {
        this.errorMessage = errorMessage;
        this.httpStatus = httpStatus;
    }
}
