package com.stackroute.muzixservice.prefill;

import com.stackroute.muzixservice.domain.Track;
import com.stackroute.muzixservice.repository.MuzixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerDemo implements CommandLineRunner {


    private  Environment environment;
    private  MuzixRepository muzixRepository;

    @Autowired
    public CommandLineRunnerDemo(Environment environment, MuzixRepository muzixRepository) {
        this.environment = environment;
        this.muzixRepository = muzixRepository;
    }

    Track track=new Track();

    @Override
    public void run(String... args) throws Exception {

        track.setTrackId(environment.getProperty("track2.id"));
        track.setTrackName(environment.getProperty("track2.name"));
        track.setTrackComments(environment.getProperty("track2.comment"));
        muzixRepository.save(track);

    }
}
