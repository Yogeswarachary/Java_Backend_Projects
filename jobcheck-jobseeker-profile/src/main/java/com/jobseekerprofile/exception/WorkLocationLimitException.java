package com.jobseekerprofile.exception;

public class WorkLocationLimitException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WorkLocationLimitException() {
		super();
	}

	public WorkLocationLimitException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WorkLocationLimitException(String message, Throwable cause) {
		super(message, cause);
	}

	public WorkLocationLimitException(String message) {
		super(message);
	}

	public WorkLocationLimitException(Throwable cause) {
		super(cause);
	}
	
}
