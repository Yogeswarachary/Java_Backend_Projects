package com.clinicservice.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.clinicservice.entites.State;
import com.clinicservice.exception.StateAlreadyExistException;
import com.clinicservice.repository.StateRepository;
import com.clinicservice.service.StateService;

public class StateServiceImpl implements StateService{
	
	@Autowired
	StateRepository stateRepo;

	@Override
	public State addState(State state) throws StateAlreadyExistException {
		State s=new State();
		if(stateRepo.existsById(state.getStateId())) {
			throw new StateAlreadyExistException();
		} else {
			s.setName(state.getName());
			return stateRepo.save(s);
		}
	}
	
	
}
