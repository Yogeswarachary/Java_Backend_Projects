package com.jobseekerprofile.exception;

public class NullWorkLocationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NullWorkLocationException() {
		super();
	}

	public NullWorkLocationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NullWorkLocationException(String message, Throwable cause) {
		super(message, cause);
	}

	public NullWorkLocationException(String message) {
		super(message);
	}

	public NullWorkLocationException(Throwable cause) {
		super(cause);
	}
	
}
