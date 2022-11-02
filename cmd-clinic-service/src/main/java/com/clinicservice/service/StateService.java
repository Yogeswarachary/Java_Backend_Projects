package com.clinicservice.service;

import com.clinicservice.entites.State;
import com.clinicservice.exception.StateAlreadyExistException;

public interface StateService {
	
	public State addState(State state) throws StateAlreadyExistException;
}
