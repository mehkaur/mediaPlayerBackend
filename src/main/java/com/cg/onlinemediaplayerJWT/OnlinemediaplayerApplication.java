package com.cg.onlinemediaplayerJWT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 
 * @author Gaurav Kashish
 */


@SpringBootApplication
public class OnlinemediaplayerApplication {
	private static final Logger LOG = LoggerFactory.getLogger(OnlinemediaplayerApplication.class);

	public static void main(String[] args) {
		LOG.info("Start");
		SpringApplication.run(OnlinemediaplayerApplication.class, args);
		LOG.info("End");
	}

}
