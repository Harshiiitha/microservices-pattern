package com.stackroute.muzixservice.controller;

import com.stackroute.muzixservice.domain.Track;
import com.stackroute.muzixservice.exceptions.TrackAlreadyExistsException;
import com.stackroute.muzixservice.exceptions.TrackListIsEmptyException;
import com.stackroute.muzixservice.exceptions.TrackNotFoundException;
import com.stackroute.muzixservice.service.MuzixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class MuzixController {


    private MuzixService muzixService;
    private Environment environment;

    @Autowired
    public MuzixController(MuzixService muzixService,Environment environment) {
        this.muzixService = muzixService;
        this.environment=environment;
    }

    @PostMapping("track")
    public ResponseEntity<?> saveTrack(@RequestBody Track track) throws TrackAlreadyExistsException
    {

        ResponseEntity responseEntity;
        Track savedTrack=null;
        savedTrack = muzixService.saveTrack(track);
        responseEntity = new ResponseEntity<Track>(savedTrack, HttpStatus.CREATED);
        return responseEntity;

    }

    @GetMapping("tracks")
    public ResponseEntity<?> getAllTracks()
    {
        try {
            return new ResponseEntity<List>(muzixService.getAllTracks(), HttpStatus.OK);
        }
        catch (TrackListIsEmptyException trackListIsEmptyException)
        {
            return new ResponseEntity<String>("tracklistisempty.message", HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("track/{id}/{comment}")
    public ResponseEntity<?> getTrackAfterUpdatingComments( @PathVariable String id,@PathVariable  String comment) throws TrackNotFoundException
    {

        ResponseEntity responseEntity;
        responseEntity=new ResponseEntity<Track>(muzixService.updateTrackComments(id, comment), HttpStatus.OK);
        return responseEntity;

    }

    @DeleteMapping("track/{id}")
    public ResponseEntity<?> getTrackAfterDeleting(@PathVariable String id) throws TrackNotFoundException
    {

        ResponseEntity responseEntity;
        responseEntity=new ResponseEntity<Track>(muzixService.deleteTrack(id), HttpStatus.OK);
        return responseEntity;

    }


}
