package com.jobseekerprofile.exception;

public class LanguageNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LanguageNotFoundException() {
		super();
	}

	public LanguageNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public LanguageNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public LanguageNotFoundException(String message) {
		super(message);
	}

	public LanguageNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
