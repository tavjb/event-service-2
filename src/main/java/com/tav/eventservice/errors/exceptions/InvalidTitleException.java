package com.tav.eventservice.errors.exceptions;

public class InvalidTitleException extends InvalidInputException {
    public InvalidTitleException(String title) {
        super("invalid title: " + title + " with length: " + title.length());
    }
}
