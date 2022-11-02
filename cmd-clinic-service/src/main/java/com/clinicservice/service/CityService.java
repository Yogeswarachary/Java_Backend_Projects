package com.clinicservice.service;

import com.clinicservice.entites.City;
import com.clinicservice.exception.StateNotFoundException;

public interface CityService {
	
	public City addCityToState(String name, City city) throws StateNotFoundException;
}
