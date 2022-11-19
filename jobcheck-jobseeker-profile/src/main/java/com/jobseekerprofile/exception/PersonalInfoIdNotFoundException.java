package com.jobseekerprofile.exception;

public class PersonalInfoIdNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PersonalInfoIdNotFoundException() {
		super();
	}

	public PersonalInfoIdNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PersonalInfoIdNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public PersonalInfoIdNotFoundException(String message) {
		super(message);
	}

	public PersonalInfoIdNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
