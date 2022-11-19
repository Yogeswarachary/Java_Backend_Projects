package com.jobseekerprofile.exception;

public class NullProfilePicException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NullProfilePicException() {
		super();
	}

	public NullProfilePicException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NullProfilePicException(String message, Throwable cause) {
		super(message, cause);
	}

	public NullProfilePicException(String message) {
		super(message);
	}

	public NullProfilePicException(Throwable cause) {
		super(cause);
	}

}
