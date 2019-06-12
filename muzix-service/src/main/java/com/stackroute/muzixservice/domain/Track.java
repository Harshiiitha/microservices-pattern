package com.stackroute.muzixservice.domain;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Track {

    @Id
    private String trackId;
    private String trackName;
    private String trackComments;

    //No Argument constructor
    public Track() {
    }

    //All Arguments constructor
    public Track(String trackId, String trackName, String trackComments) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.trackComments = trackComments;
    }

    //setter and getter methods
    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackComments() {
        return trackComments;
    }

    public void setTrackComments(String trackComments) {
        this.trackComments = trackComments;
    }


}
