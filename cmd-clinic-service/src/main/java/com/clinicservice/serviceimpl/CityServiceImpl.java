package com.clinicservice.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.clinicservice.entites.City;
import com.clinicservice.entites.State;
import com.clinicservice.exception.StateNotFoundException;
import com.clinicservice.repository.CityRepository;
import com.clinicservice.repository.StateRepository;
import com.clinicservice.service.CityService;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService{
	
	@Autowired
	StateRepository stateRepo;
	
	@Autowired
	CityRepository cityRepo;

	@Override
	public City addCityToState(String name, City city) throws StateNotFoundException {
		State state=stateRepo.getStateObj(name);
		if(state!=null) {
			City cit=new City();
			List<City> c=state.getCity();
			cit.setCityName(city.getCityName());
			c.add(cit);
			cityRepo.save(cit);
			return cit;
		}else {
			throw new StateNotFoundException();
		}
	}
	
	

	
}
