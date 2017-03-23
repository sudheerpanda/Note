/*
 * Copyright 2017-2018 the original author or authors.
 *
 * Licensed under xxxxxxxxx
 */
package org.note.service;

import java.io.IOException;
import java.util.ArrayList;

import org.note.exception.ServiceException;
import org.note.model.Note;

/**
 * @author sudheer panda
 *			This interface will do the CRUD operations on notes
 */
public interface NoteService {
  
	/**
	 * Get the note by name
	 * @param name
	 * @return
	 * @throws ServiceException
	 * @throws IOException
	 */
	Note getNoteByName(String name) throws ServiceException,IOException;
	
	/**
	 * Add a note 
	 * @param note
	 * @return
	 * @throws ServiceException
	 * @throws IOException
	 */
	ArrayList<Note> addNote(Note note) throws ServiceException,IOException;
	
	/**
	 * delete a node
	 * @param name
	 * @return
	 * @throws ServiceException
	 * @throws IOException
	 */
	boolean deleteNote(String name)throws ServiceException,IOException;
	
	/**
	 * get all the notes
	 * @return
	 * @throws ServiceException
	 * @throws IOException
	 */
	ArrayList<Note> getAll()throws ServiceException,IOException;
}
