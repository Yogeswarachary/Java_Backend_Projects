package com.jobseekerprofile.exception;

public class DuplicateLanguagesException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DuplicateLanguagesException() {
		super();
	}

	public DuplicateLanguagesException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DuplicateLanguagesException(String message, Throwable cause) {
		super(message, cause);
	}

	public DuplicateLanguagesException(String message) {
		super(message);
	}

	public DuplicateLanguagesException(Throwable cause) {
		super(cause);
	}
	
}
