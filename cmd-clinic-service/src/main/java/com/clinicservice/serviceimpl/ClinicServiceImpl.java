package com.clinicservice.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.clinicservice.entites.Clinic;
import com.clinicservice.entites.Doctor;
import com.clinicservice.exception.CityNotFoundException;
import com.clinicservice.exception.ClinicAlreadyExistException;
import com.clinicservice.exception.ClinicNotFoundException;
import com.clinicservice.exception.DoctorAlreadyExistException;
import com.clinicservice.exception.DoctorNotFoundException;
import com.clinicservice.pojo.ClinicRequest;
import com.clinicservice.pojo.DoctorRequest;
import com.clinicservice.repository.CityRepository;
import com.clinicservice.repository.ClinicRepository;
import com.clinicservice.repository.DoctorRepository;
import com.clinicservice.service.ClinicService;

public class ClinicServiceImpl implements ClinicService{
	
	@Autowired
	ClinicRepository clinicRepo;
	
	@Autowired
	CityRepository cityRepo;
	
	@Autowired
	DoctorRepository doctorRepo;

	@Override
	public Clinic addClinic(ClinicRequest clinicReq) throws ClinicAlreadyExistException {
		Clinic clinic=new Clinic();
		clinic.setClinicId(clinicReq.getClinicId());
		clinic.setClinicName(clinicReq.getClinicName());;
		clinic.setBusinessName(clinicReq.getBusinessName());
		clinic.setClinicCountry(clinicReq.getClinicCountry());
		clinic.setStreetAddr(clinicReq.getStreetAddr());
		clinic.setDateCreated(clinicReq.getDateCreated());
		clinic.setZipcode(clinicReq.getZipcode());
		clinic.setLatitude(clinicReq.getLatitude());
		clinic.setLongitude(clinicReq.getLongitude());
	
		if(clinicRepo.existsById(clinicReq.getClinicId())) {
			throw new ClinicAlreadyExistException();
		}
		return clinicRepo.save(clinic);
	}

	@Override
	public Clinic addClinicToCity(long cityId, ClinicRequest clinicReq) throws CityNotFoundException {
		if(!cityRepo.existsById(cityId)) {
			throw new CityNotFoundException();
		} else {
			List<Clinic> cl=cityRepo.getCityById(cityId).getClinic();
			Clinic c=new Clinic();
			c.setClinicId(clinicReq.getClinicId());
			c.setClinicName(clinicReq.getClinicName());
			c.setBusinessName(clinicReq.getBusinessName());
			c.setClinicCountry(clinicReq.getClinicCountry());
			c.setStreetAddr(clinicReq.getStreetAddr());
			c.setDateCreated(clinicReq.getDateCreated());
			c.setLatitude(clinicReq.getLatitude());
			c.setLongitude(clinicReq.getLongitude());
			c.setZipcode(clinicReq.getZipcode());
			cl.add(c);
			clinicRepo.save(c);
			return c;
		}
		
	}

	@Override
	public Clinic editClinicDetails(Clinic clinic) throws ClinicNotFoundException {
		if(clinicRepo.existsById(clinic.getClinicId())) {
			Clinic c = new Clinic();
			c=clinicRepo.getClinicObject(clinic.getClinicId());
			c.setClinicName(clinic.getClinicName());
			c.setBusinessName(clinic.getBusinessName());
			c.setStreetAddr(clinic.getStreetAddr());
			c.setClinicCountry(clinic.getClinicCountry());
			c.setDateCreated(clinic.getDateCreated());
			c.setLongitude(clinic.getLongitude());
			c.setLatitude(clinic.getLatitude());
			c.setZipcode(clinic.getZipcode());
			clinicRepo.save(c);
			return c;
			}
	else {
		throw new ClinicNotFoundException();
	}
}

	@Override
	public String deleteClinic(long clinicId) throws ClinicNotFoundException {
		if(clinicRepo.existsById(clinicId)) {
			clinicRepo.deleteById(clinicId);
		}else {
			throw new ClinicNotFoundException();
		}
	return "Deleted successfully";
}

	@Override
	public List<Clinic> getViewAllClinic() throws ClinicNotFoundException {
		List<Clinic> clinics = clinicRepo.getViewAllClinic();
        if(clinics.isEmpty()) {
            throw new ClinicNotFoundException();
        }
        return clinics;
	}

	@Override
	public Doctor addDoctorsToClinic(DoctorRequest doctor, long clinicId)
			throws DoctorAlreadyExistException, ClinicAlreadyExistException, DoctorNotFoundException {
		if(clinicRepo.existsById(clinicId)) {				
			Clinic clinic=clinicRepo.getClinicObject(clinicId);
			Doctor doc=new Doctor();
			doc.setName(doctor.getUsername());
			doc.setTitle(doctor.getTitle());
			doc.setNpi_no(doctor.getNpi_no());
			doc.setSpeciality(doctor.getSpeciality());
			doc.setPhone_no(doctor.getPhone_no());
			doc.setGender(doctor.getGender());
			doc.setEmail(doctor.getEmail());
			doc.setPractice_location(doctor.getPractice_location());
			doctorRepo.save(doc);
			clinic.getDoctor().add(doc);
			doc.getClinic().add(clinic);
			clinicRepo.save(clinic);
			doctorRepo.save(doc);
			return doc;
		}else {
			throw new ClinicNotFoundException();
		}
	}

	@Override
	public Clinic getClinicById(long clinicId) {
		Clinic clini = null;
        if(clinicRepo.existsById(clinicId)) {
            clini = clinicRepo.getClinicObject(clinicId);
        }
        else{
            throw new ClinicNotFoundException();
        }
        return clini;
    }
}
