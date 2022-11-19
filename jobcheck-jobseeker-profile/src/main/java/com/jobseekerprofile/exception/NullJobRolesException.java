package com.jobseekerprofile.exception;

public class NullJobRolesException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NullJobRolesException() {
		super();
	}

	public NullJobRolesException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NullJobRolesException(String message, Throwable cause) {
		super(message, cause);
	}

	public NullJobRolesException(String message) {
		super(message);
	}

	public NullJobRolesException(Throwable cause) {
		super(cause);
	}
	
}
