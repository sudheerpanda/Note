/*
 * Copyright 2017-2018 the original author or authors.
 *
 * Licensed under  XXXXXXXX
 */
package org.note.model;

/**
 * @author sudheer panda
 * 
 */

public class Note {

	
	private String name;
	private String message;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Note [name=" + name + ", message=" + message + "]";
	}
	
	
}
