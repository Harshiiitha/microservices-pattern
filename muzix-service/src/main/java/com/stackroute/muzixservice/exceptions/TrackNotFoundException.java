package com.stackroute.muzixservice.exceptions;

public class TrackNotFoundException extends Exception {

    private String message;

    //No arg constructor
    public TrackNotFoundException() {
    }

    //All arg constructor
    public TrackNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}
