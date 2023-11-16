package com.restaurant.restaurant.config;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.restaurant.restaurant.dto.ErrorDto;
import com.restaurant.restaurant.exceptions.AppException;

@Controller
public class RestExceptionHandler {

  @ExceptionHandler(value = { AppException.class })
  @ResponseBody
  public ResponseEntity<ErrorDto> handleException(AppException ex) {
    return ResponseEntity.status((ex.getCode())).body(ErrorDto.builder().message(ex.getMessage()).build());
  }
}
