package com.clinicservice.exception;

public class ServiceAlreadyExistException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServiceAlreadyExistException() {
		super();
	}

	public ServiceAlreadyExistException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ServiceAlreadyExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServiceAlreadyExistException(String message) {
		super(message);
	}

	public ServiceAlreadyExistException(Throwable cause) {
		super(cause);
	}
	
	
	
}
