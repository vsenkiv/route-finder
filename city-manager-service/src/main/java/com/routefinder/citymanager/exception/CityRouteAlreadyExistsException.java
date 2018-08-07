package com.routefinder.citymanager.exception;

public class CityRouteAlreadyExistsException extends RuntimeException {

    public CityRouteAlreadyExistsException() {
        super();
    }

    public CityRouteAlreadyExistsException(String message) {
        super(message);
    }
}

