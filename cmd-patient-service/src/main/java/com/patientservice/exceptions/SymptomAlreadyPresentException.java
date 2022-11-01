package com.patientservice.exceptions;

public class SymptomAlreadyPresentException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SymptomAlreadyPresentException() {
		super();
	}

	public SymptomAlreadyPresentException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SymptomAlreadyPresentException(String message, Throwable cause) {
		super(message, cause);
	}

	public SymptomAlreadyPresentException(String message) {
		super(message);
	}

	public SymptomAlreadyPresentException(Throwable cause) {
		super(cause);
	}
}
