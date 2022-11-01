package com.patientservice.exceptions;

public class PatientAlreadyExistsException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PatientAlreadyExistsException() {
		super();
	}

	public PatientAlreadyExistsException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PatientAlreadyExistsException(String message, Throwable cause) {
		super(message, cause);
	}

	public PatientAlreadyExistsException(String message) {
		super(message);
	}

	public PatientAlreadyExistsException(Throwable cause) {
		super(cause);
	}
}
