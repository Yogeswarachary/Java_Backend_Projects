package com.clinicservice.exception;

public class DoctorAlreadyExistException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DoctorAlreadyExistException() {
		super();
	}

	public DoctorAlreadyExistException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DoctorAlreadyExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public DoctorAlreadyExistException(String message) {
		super(message);
	}

	public DoctorAlreadyExistException(Throwable cause) {
		super(cause);
	}

	
}
