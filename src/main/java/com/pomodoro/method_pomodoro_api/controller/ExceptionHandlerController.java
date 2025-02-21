package com.pomodoro.method_pomodoro_api.controller;

import com.pomodoro.method_pomodoro_api.dto.ErrorDTO;
import com.pomodoro.method_pomodoro_api.exceptions.ResourceNotFound;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ExceptionHandlerController {

    public ErrorDTO handlerResourceNotFound(ResourceNotFound e, HttpServletRequest request){

        HttpStatus status = HttpStatus.NOT_FOUND;

        ErrorDTO error = new ErrorDTO(Instant.now(), status.value(), e.getMessage(), request.getRequestURI());

        return error;
    }

}
