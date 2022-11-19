package com.jobseekerprofile.exception;

public class PersonNotExistException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PersonNotExistException() {
		super();
	}

	public PersonNotExistException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PersonNotExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public PersonNotExistException(String message) {
		super(message);
	}

	public PersonNotExistException(Throwable cause) {
		super(cause);
	}
	
}
