package com.routefinder.citymanager.exception;

public class InvalidTimeRangeException extends RuntimeException{

    public InvalidTimeRangeException() {
        super();
    }

    public InvalidTimeRangeException(String message) {
        super(message);
    }
}
