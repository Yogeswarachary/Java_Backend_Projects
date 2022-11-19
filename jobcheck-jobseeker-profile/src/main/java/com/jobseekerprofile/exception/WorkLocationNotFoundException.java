package com.jobseekerprofile.exception;

public class WorkLocationNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WorkLocationNotFoundException() {
		super();
	}

	public WorkLocationNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WorkLocationNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public WorkLocationNotFoundException(String message) {
		super(message);
	}

	public WorkLocationNotFoundException(Throwable cause) {
		super(cause);
	}

}
