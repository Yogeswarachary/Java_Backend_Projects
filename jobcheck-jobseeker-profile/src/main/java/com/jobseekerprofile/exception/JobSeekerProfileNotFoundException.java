package com.jobseekerprofile.exception;

public class JobSeekerProfileNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JobSeekerProfileNotFoundException() {
		super();
	}

	public JobSeekerProfileNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public JobSeekerProfileNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public JobSeekerProfileNotFoundException(String message) {
		super(message);
	}

	public JobSeekerProfileNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
