/*
 * Copyright 2016-2017 the original author or authors.
 *
 * Licensed under Imaginea Technologies pvt limited
 */
package org.note.exception;

/**
 * @author sudheerp
 *This class used to send the service level exception to ressource layer/cleint
 */
public class ServiceException extends Exception {

	/**
	 * 
	 */
	public ServiceException() {
	}

	/**
	 * @param message
	 */
	public ServiceException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ServiceException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
