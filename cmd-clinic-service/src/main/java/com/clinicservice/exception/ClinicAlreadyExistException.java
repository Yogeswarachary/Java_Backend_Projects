package com.clinicservice.exception;

public class ClinicAlreadyExistException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ClinicAlreadyExistException() {
		super();
	}

	public ClinicAlreadyExistException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ClinicAlreadyExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public ClinicAlreadyExistException(String message) {
		super(message);
	}

	public ClinicAlreadyExistException(Throwable cause) {
		super(cause);
	}
	
	
}
