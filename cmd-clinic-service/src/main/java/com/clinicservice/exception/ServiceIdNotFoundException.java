package com.clinicservice.exception;

public class ServiceIdNotFoundException extends  Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServiceIdNotFoundException() {
		super();
	}

	public ServiceIdNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ServiceIdNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServiceIdNotFoundException(String message) {
		super(message);
	}

	public ServiceIdNotFoundException(Throwable cause) {
		super(cause);
	}
	
	
}
