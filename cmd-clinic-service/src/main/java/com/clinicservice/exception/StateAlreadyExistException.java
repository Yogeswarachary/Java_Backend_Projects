package com.clinicservice.exception;

public class StateAlreadyExistException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StateAlreadyExistException() {
		super();
	}

	public StateAlreadyExistException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public StateAlreadyExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public StateAlreadyExistException(String message) {
		super(message);
	}

	public StateAlreadyExistException(Throwable cause) {
		super(cause);
	}
	
	
}
