package com.micro.charactertracker.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import javax.persistence.EntityNotFoundException;

@RestControllerAdvice(basePackages = "com.micro.charactertracker.controller")
public class ConrtollerExceptionHandler{
    /* al descomentar tendras que fijarte muy bien en el Builder (busca informacion)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = InternalError.class)
    public ErrorMessage handleMiExcepcion(InternalError exception, WebRequest request) {
        return ErrorMessage.builder()
                .message(exception.getMessage())
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .build();
    }
    */
}