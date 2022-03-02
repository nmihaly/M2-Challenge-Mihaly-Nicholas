package com.company.MonthAndMathService.exceptions;

public class NotFoundException extends RuntimeException {

    public NotFoundException() {
        super();
    }

    public NotFoundException(String msg) {
        super(msg);
    }
}
