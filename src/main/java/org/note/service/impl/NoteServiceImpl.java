/*
 * Copyright 2016-2017 the original author or authors.
 *
 * Licensed under Imaginea Technologies pvt limited
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
 * @author sudheerp This class is used to get/add/delete/update a note
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

		if (note != null) {
			notes.put(note.getName(), note);
		}
		return getAll();
	}
	/**
	 * This method is used to delete a particular note by name
	 */
	@Override
	public boolean deleteNote(String name) throws ServiceException, IOException {
		boolean delFlag = false;
		if (name != null) {
			Note note = notes.remove(name);
			if (note != null) {
				delFlag = true;
			}
		}
		return delFlag;
	}

	/**
	 * This method is used to get all the notes 
	 */
	@Override
	public ArrayList<Note> getAll() throws ServiceException, IOException {
		ArrayList<Note> noteResponses = new ArrayList<Note>();
		Iterator<Entry<String, Note>> notesIterator = notes.entrySet()
				.iterator();
		while (notesIterator.hasNext()) {
			noteResponses.add(notesIterator.next().getValue());
		}
		return noteResponses;
	}

}
