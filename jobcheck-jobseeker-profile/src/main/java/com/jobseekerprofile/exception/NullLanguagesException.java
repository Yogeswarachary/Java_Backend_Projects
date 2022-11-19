package com.jobseekerprofile.exception;

public class NullLanguagesException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NullLanguagesException() {
		super();
	}

	public NullLanguagesException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NullLanguagesException(String message, Throwable cause) {
		super(message, cause);
	}

	public NullLanguagesException(String message) {
		super(message);
	}

	public NullLanguagesException(Throwable cause) {
		super(cause);
	}

}
