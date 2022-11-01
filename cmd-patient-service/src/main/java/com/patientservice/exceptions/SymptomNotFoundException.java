package com.patientservice.exceptions;

public class SymptomNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SymptomNotFoundException() {
		super();
	}

	public SymptomNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SymptomNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public SymptomNotFoundException(String message) {
		super(message);
	}

	public SymptomNotFoundException(Throwable cause) {
		super(cause);
	}
	
	
}
