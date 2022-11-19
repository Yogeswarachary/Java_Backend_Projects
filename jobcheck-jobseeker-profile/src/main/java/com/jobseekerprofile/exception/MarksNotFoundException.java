package com.jobseekerprofile.exception;

public class MarksNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarksNotFoundException() {
		super();
	}

	public MarksNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MarksNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public MarksNotFoundException(String message) {
		super(message);
	}

	public MarksNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
