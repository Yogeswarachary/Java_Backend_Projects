package com.clinicservice.exception;

public class ClinicNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ClinicNotFoundException() {
		super();
	}

	public ClinicNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ClinicNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ClinicNotFoundException(String message) {
		super(message);
	}

	public ClinicNotFoundException(Throwable cause) {
		super(cause);
	}

	
}
