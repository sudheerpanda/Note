/*
 * Copyright 2016-2017 the original author or authors.
 *
 * Licensed under Imaginea Technologies pvt limited
 */
package org.note.service;

import java.io.IOException;
import java.util.ArrayList;

import org.note.exception.ServiceException;
import org.note.model.Note;

/**
 * @author sudheerp
 *This interface is used  get the product sample details
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
