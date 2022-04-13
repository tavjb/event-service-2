package com.tav.eventservice.errors.exceptions;

public class InvalidDateException extends InvalidInputException {
    public InvalidDateException(String fieldName) {
        super("Invalid field: " + fieldName);
    }
}
