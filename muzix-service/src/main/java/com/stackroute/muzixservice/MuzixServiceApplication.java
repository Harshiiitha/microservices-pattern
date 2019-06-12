package com.stackroute.muzixservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //to enable muzixservice as eureka client
public class MuzixServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuzixServiceApplication.class, args);

	}
}
