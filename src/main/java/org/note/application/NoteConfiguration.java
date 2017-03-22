/*
 * Copyright 2016-2017 the original author or authors.
 *
 * Licensed under  XXXX
 */
package org.note.application;

import org.note.service.NoteService;
import org.note.service.impl.NoteServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sudheerp This class is used to configure the beans.
 */
@Configuration
public class NoteConfiguration {
	private static final Logger LOGGER = LoggerFactory.getLogger(NoteServiceImpl.class);

	/*
	 * This will create a note service bean
	 */
	@Bean
	public NoteService getProductSampleService() {
		LOGGER.info("creating bean", NoteService.class);
		NoteService service = new NoteServiceImpl();
		LOGGER.info("Created bean", NoteService.class);
		return service;
	}
}
