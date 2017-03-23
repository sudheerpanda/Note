/*
 * Copyright 2017-2018 the original author or authors.
 *
 * Licensed under xxxxxxxxx
 */
package org.note.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.note.exception.ServiceException;
import org.note.model.Note;
import org.note.service.NoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author 	sudheer panda 
 * 			This class is used to get/add/delete/update a note
 */
@Service
public class NoteServiceImpl implements NoteService {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(NoteServiceImpl.class);

	HashMap<String, Note> notes = new HashMap<String, Note>();

	/**
	 * This method is used to get the note by note name
	 */
	@Override
	public Note getNoteByName(String name) throws ServiceException, IOException {
		LOGGER.info("Started executing to get the details of note-{}", name);

		Note note = notes.get(name);

		LOGGER.info("Succefully got  the details of note for the name -{}",
				name);
		return note;

	}

	/**
	 * This method is used to add a note into map/db
	 */

	@Override
	public ArrayList<Note> addNote(Note note) throws ServiceException,
			IOException {
		LOGGER.info("Adding a not into map ,note is-{}",note);
		if (note != null) {
			notes.put(note.getName(), note);
		}
		LOGGER.info("Successfully added the note into map ,not is-{}",note);
		return getAll();
	}
	/**
	 * This method is used to delete a particular note by name
	 */
	@Override
	public boolean deleteNote(String name) throws ServiceException, IOException {
		boolean delFlag = false;
		LOGGER.info("Deleing a note from map ,note name- {}",name);
		if (name != null) {
			Note note = notes.remove(name);
			if (note != null) {
				delFlag = true;
				LOGGER.info("Successfully deleted the note from map,note name-{}",name);
			}
		}
		if(!delFlag){
			LOGGER.info("There is not note in this name ,SO deletion not happened & the note name -{}",name);
		}
		return delFlag;
	}

	/**
	 * This method is used to get all the notes 
	 */
	@Override
	public ArrayList<Note> getAll() throws ServiceException, IOException {
		LOGGER.info("Getting all the note details from map");
		ArrayList<Note> noteResponses = new ArrayList<Note>();
		Iterator<Entry<String, Note>> notesIterator = notes.entrySet()
				.iterator();
		while (notesIterator.hasNext()) {
			noteResponses.add(notesIterator.next().getValue());
		}
		LOGGER.info("Successfully got all the note,The total number of notes in map are -{}",noteResponses.size());
		return noteResponses;
	}

}
