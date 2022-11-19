package com.jobseekerprofile.exception;

public class NullSkillsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NullSkillsException() {
		super();
	}

	public NullSkillsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NullSkillsException(String message, Throwable cause) {
		super(message, cause);
	}

	public NullSkillsException(String message) {
		super(message);
	}

	public NullSkillsException(Throwable cause) {
		super(cause);
	}
	
}
