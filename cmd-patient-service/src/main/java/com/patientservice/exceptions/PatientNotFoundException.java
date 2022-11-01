package com.patientservice.exceptions;

public class PatientNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PatientNotFoundException() {
		super();
	}

	public PatientNotFoundException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public PatientNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public PatientNotFoundException(String arg0) {
		super(arg0);
	}

	public PatientNotFoundException(Throwable arg0) {
		super(arg0);
	}

}
