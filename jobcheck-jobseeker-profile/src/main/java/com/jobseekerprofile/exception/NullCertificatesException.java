package com.jobseekerprofile.exception;

public class NullCertificatesException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NullCertificatesException() {
		super();
	}

	public NullCertificatesException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NullCertificatesException(String message, Throwable cause) {
		super(message, cause);
	}

	public NullCertificatesException(String message) {
		super(message);
	}

	public NullCertificatesException(Throwable cause) {
		super(cause);
	}
	
}
