package com.doctorservice.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctorservice.entites.Availability;
import com.doctorservice.enums.AvailabilityStatus;
import com.doctorservice.enums.Day;
import com.doctorservice.exception.DoctorNotFoundException;
import com.doctorservice.repository.AvailabilityRepository;
import com.doctorservice.repository.DoctorRepository;
import com.doctorservice.service.AvailabilityService;

@Service
public class AvailabilityServiceImpl implements AvailabilityService{
	
	@Autowired
	DoctorRepository docRepo;
	
	
	@Autowired
	AvailabilityRepository availRepo;

	@Override
	public Availability setDoctorAvailability(long id, Day day, AvailabilityStatus status) throws DoctorNotFoundException {

		if(docRepo.existsById(id))
		{
			Availability a1 = new Availability();
			a1.setDay(day);
			a1.setStatus(status);
			a1.setDoctorId(docRepo.findByDoctorId(id).getId());
			availRepo.save(a1);
			return a1;
		}
		else
		{
			throw new DoctorNotFoundException();
		}
	}

	@Override
	public Availability getDoctorAvailability(long id, Day day) {
		if(docRepo.existsById(id))return availRepo.getDoctorAvailabilityByDay(id, day);
		else throw new DoctorNotFoundException("Doctor not found by that id and day , try a valid id");
	}

	@Override
    public List<Availability> getDoctorAvailability(long id) throws DoctorNotFoundException{
        if(docRepo.existsById(id)) {
            return availRepo.findAvailabilityById(id);
        }
        else {
            throw new DoctorNotFoundException("This doctor id is not valid please try with valid Id.");
        }
	}
}
