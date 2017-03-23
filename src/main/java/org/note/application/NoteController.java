/*
 * Copyright 2017-2018 the original author or authors.
 *
 * Licensed under xxxxxxxxx
 */
package org.note.application;

import java.io.IOException;
import java.util.ArrayList;

import org.note.exception.ServiceException;
import org.note.model.Note;
import org.note.service.NoteService;
import org.note.service.impl.NoteServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author sudheer panda 
 * 			This class is used to do CRUD operation on notes
 */
@RestController
@RequestMapping("/note")
public class NoteController {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(NoteServiceImpl.class);

	@Autowired
	NoteService service;

	/**
	 * This method is used to get the details note by name
	 * 
	 */
	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	@RequestMapping(value = "/get", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Note getNote(
			@RequestParam(value = "name", required = true) String name)
			throws ServiceException, IOException {
		LOGGER.info("Getting the note details by name");
		Note note = service.getNoteByName(name);
		LOGGER.info("Successfully got the notes details by name");
		return note;
	}

	/**
	 * This will add the note into map for later use
	 * @param note
	 * @return
	 * @throws ServiceException
	 * @throws IOException
	 */
	@ExceptionHandler(ServiceException.class)
	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Note> add(@RequestBody Note note) throws ServiceException,
			IOException {
		LOGGER.info(" Started adding note ");
		ArrayList<Note> notes = service.addNote(note);
		LOGGER.info("Successfully added the note");
		return notes;
	}

	/**
	 * This method is used to get all the notes added into map
	 * @return
	 * @throws ServiceException
	 * @throws IOException
	 */
	@ExceptionHandler(ServiceException.class)
	@RequestMapping(value = "/get/ALL", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Note> getAll() throws ServiceException, IOException {
		LOGGER.info("Getting  all the note details");
		ArrayList<Note> notes = service.getAll();
		LOGGER.info("Successfully got  all the notes");
		return notes;
	}

	/**
	 * This method is used to delete the note from map by name
	 * @param name
	 * @throws ServiceException
	 * @throws IOException
	 */
	@ExceptionHandler(ServiceException.class)
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void delete(
			@RequestParam(value = "name", required = true) String name)
			throws ServiceException, IOException {
		LOGGER.info("Deleting  the note details by name");
		service.deleteNote(name);
		LOGGER.info("Successfully deleted the notes & details by name");

	}

}