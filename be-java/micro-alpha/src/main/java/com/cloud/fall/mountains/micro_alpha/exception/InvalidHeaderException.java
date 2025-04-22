package com.cloud.fall.mountains.micro_alpha.exception;

import lombok.Getter;

@Getter
public class InvalidHeaderException extends RuntimeException {

    private final String code;
    private final String message;

    public InvalidHeaderException(String code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }
}
