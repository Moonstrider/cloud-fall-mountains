package com.cloud.fall.mountains.micro_alpha.exception.handler;

import com.cloud.fall.mountains.micro_alpha.exception.InvalidHeaderException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {InvalidHeaderException.class})
    public ResponseEntity<ErrorResponse> handleHeaderValidationException(
        InvalidHeaderException ex) {
        log.error("Header validation exception: {}", ex.getMessage());
        ErrorResponse errorDetail = new ErrorResponse();
        errorDetail.setField(ex.getCode());
        errorDetail.setMessage(ex.getMessage());
        return ResponseEntity.badRequest().body(errorDetail);
    }
}
