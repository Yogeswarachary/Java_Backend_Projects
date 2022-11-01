package com.patientservice.exceptions;

public class SymptomListIsEmptyException extends RuntimeException {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SymptomListIsEmptyException() {
		super();
	}

	public SymptomListIsEmptyException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SymptomListIsEmptyException(String message, Throwable cause) {
		super(message, cause);
	}

	public SymptomListIsEmptyException(String message) {
		super(message);
	}

	public SymptomListIsEmptyException(Throwable cause) {
		super(cause);
	}
	
	
}
