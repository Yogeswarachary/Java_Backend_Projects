package com.clinicservice.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.clinicservice.entites.Clinic;
import com.clinicservice.entites.ClinicAvailability;
import com.clinicservice.enums.Status;
import com.clinicservice.enums.Week;
import com.clinicservice.exception.ClinicNotFoundException;
import com.clinicservice.repository.ClinicAvailabilityRepository;
import com.clinicservice.repository.ClinicRepository;
import com.clinicservice.service.ClinicAvailabilityService;

public class ClinicAvailabilityServiceImpl implements ClinicAvailabilityService{
	
	@Autowired
	ClinicRepository clinicRepo;
	
	@Autowired
	ClinicAvailabilityRepository clinicAvailRepo;

	@Override
	public ClinicAvailability setClinicAvailability(long id, Week week, Status status) {
		if(clinicRepo.existsById(id)) {
			ClinicAvailability ca=new ClinicAvailability();
			ca.setWeek(week);
			ca.setStatus(null);
			ca.setClinic(clinicRepo.getClinicObject(id));
			clinicAvailRepo.save(ca);
			return ca;
		}
		else {
			throw new ClinicNotFoundException();
		}
	}

	@Override
	public List<Clinic> getClinicAvailability(Week week) {
		
		List<ClinicAvailability> ca=clinicAvailRepo.getClinicByDay(week);
		List<Clinic> cli=new ArrayList<>();		
		for(ClinicAvailability c:ca) {
//			if(c.getStatus()!=Status.closed) {
//				cli.add(c.getClinic());				
//			}
		}
		return cli;
	}

	
}
