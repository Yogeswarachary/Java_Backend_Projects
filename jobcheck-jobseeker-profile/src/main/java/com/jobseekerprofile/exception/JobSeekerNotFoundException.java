package com.jobseekerprofile.exception;

public class JobSeekerNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JobSeekerNotFoundException() {
		super();
	}

	public JobSeekerNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public JobSeekerNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public JobSeekerNotFoundException(String message) {
		super(message);
	}

	public JobSeekerNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
