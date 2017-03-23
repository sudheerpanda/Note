/*
 * Copyright 2017-2018 the original author or authors.
 *
 * Licensed under xxxxxxxxx
 */
package org.note.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @author sudheer panda
 * 			This class is used to  configure the
 *         application/starting the server embeded to th spring boot. By default
 *         tomcat is embdded to spring boot.we can change the port,threads etc..
 *         using application.properties	
 */
@SpringBootApplication
public class NoteApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(NoteApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Loading the spring boot");
		ApplicationContext context = new AnnotationConfigApplicationContext(NoteConfiguration.class);
		SpringApplication.run(NoteApplication.class, args);
		LOGGER.info("Succesfully started the spring boot");

	}

}