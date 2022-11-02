package com.clinicservice.exception;

public class StateNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StateNotFoundException() {
		super();
	}

	public StateNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public StateNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public StateNotFoundException(String message) {
		super(message);
	}

	public StateNotFoundException(Throwable cause) {
		super(cause);
	}

	
}
