package com.jobseekerprofile.exception;

public class NullEducationDetailException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NullEducationDetailException() {
		super();
	}

	public NullEducationDetailException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NullEducationDetailException(String message, Throwable cause) {
		super(message, cause);
	}

	public NullEducationDetailException(String message) {
		super(message);
	}

	public NullEducationDetailException(Throwable cause) {
		super(cause);
	}

}
