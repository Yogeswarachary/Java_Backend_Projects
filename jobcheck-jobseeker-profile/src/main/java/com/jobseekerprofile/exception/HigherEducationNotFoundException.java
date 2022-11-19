package com.jobseekerprofile.exception;

public class HigherEducationNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HigherEducationNotFoundException() {
		super();
	}

	public HigherEducationNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public HigherEducationNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public HigherEducationNotFoundException(String message) {
		super(message);
	}

	public HigherEducationNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
