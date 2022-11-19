package com.jobseekerprofile.exception;

public class CertificateNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CertificateNotFoundException() {
		super();
	}

	public CertificateNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CertificateNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public CertificateNotFoundException(String message) {
		super(message);
	}

	public CertificateNotFoundException(Throwable cause) {
		super(cause);
	}
	
	

}
