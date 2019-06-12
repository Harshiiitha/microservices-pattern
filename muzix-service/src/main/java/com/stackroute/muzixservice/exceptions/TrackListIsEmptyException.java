package com.stackroute.muzixservice.exceptions;

public class TrackListIsEmptyException extends Exception{

    public String message;

    //No Arg constructor
    public TrackListIsEmptyException()
    {

    }
    //All arg constructor
    public TrackListIsEmptyException(String message) {
        super(message);
        this.message = message;
    }




}
