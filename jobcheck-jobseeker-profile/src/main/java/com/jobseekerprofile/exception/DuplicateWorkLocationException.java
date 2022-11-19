package com.jobseekerprofile.exception;

public class DuplicateWorkLocationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DuplicateWorkLocationException() {
		super();
	}

	public DuplicateWorkLocationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DuplicateWorkLocationException(String message, Throwable cause) {
		super(message, cause);
	}

	public DuplicateWorkLocationException(String message) {
		super(message);
	}

	public DuplicateWorkLocationException(Throwable cause) {
		super(cause);
	}
	
	

}
