package com.stackroute.muzixservice.exceptions;

public class TrackAlreadyExistsException extends Exception{

    private String message;

    //No Arg constructor
    public TrackAlreadyExistsException()
    {

    }

    //All Arg constructor
    public TrackAlreadyExistsException(String message)
    {
        super(message);
        this.message=message;
    }
}
