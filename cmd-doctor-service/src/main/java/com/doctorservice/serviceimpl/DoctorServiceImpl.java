package com.doctorservice.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctorservice.entites.Appointment;
import com.doctorservice.entites.Availability;
import com.doctorservice.entites.Doctor;
import com.doctorservice.entites.DoctorDto;
import com.doctorservice.entites.Patient;
import com.doctorservice.enums.Day;
import com.doctorservice.exception.DoctorAlreadyExistException;
import com.doctorservice.exception.DoctorNotFoundException;
import com.doctorservice.mapper.DoctorMapper;
import com.doctorservice.repository.AvailabilityRepository;
import com.doctorservice.repository.DoctorRepository;
import com.doctorservice.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService{
	
	@Autowired
	private DoctorRepository docRepo;
	
	@Autowired
	AvailabilityRepository avaRepo;
	
	@Autowired
	private DoctorMapper mapper;
	
	@Override
	public Doctor getDoctorInfo(long id) throws DoctorNotFoundException {
		return docRepo.findById(id).orElseThrow(()->new DoctorNotFoundException("Doctor does not exist with this id."));
	}

	@Override
	public Doctor saveDoctorInfo(Doctor doctor) throws DoctorAlreadyExistException {
	if(docRepo.existsById(doctor.getId())) {
		throw new DoctorAlreadyExistException();
	}
	Doctor doc = docRepo.save(doctor);
		return doc;
	}

	@Override
	public Doctor editDoctor(Doctor doctor) throws DoctorNotFoundException {
	Doctor doc = docRepo.findByDoctorId(doctor.getId());
	if(docRepo.existsById(doctor.getId())) {
	doc.setId(doctor.getId());
	doc.setName(doctor.getName());
	doc.setTitle(doctor.getTitle());
	doc.setPhone_no(doctor.getPhone_no());
	doc.setEmail(doctor.getEmail());
	doc.setGender(doctor.getGender());
	doc.setNpi_no(doctor.getNpi_no());
	doc.setBlood_group(doctor.getBlood_group());
	doc.setPractice_location(doctor.getPractice_location());
	doc.setSpeciality(doctor.getSpeciality());
	doc.setDob(doctor.getDob());
	doc.setPassword(doctor.getPassword());
	doc.setProfile_picture(doctor.getProfile_picture());
	doc.setRole(doctor.getRole());
	doc.setUsername(doctor.getUsername());
	
	docRepo.save(doc);
		return doc;
		}
	else {
		throw new DoctorNotFoundException("No doctor is found by this Id");
		}
	}
	@Override
	public List<DoctorDto> getAllDoctors() throws DoctorNotFoundException {
		List<Doctor> doctors = docRepo.findAll();
		DoctorDto docDto = new DoctorDto();
		List<DoctorDto> dto = new ArrayList<DoctorDto>();
		for(Doctor d: doctors) {
			docDto = mapper.convertToDto(d);
			dto.add(docDto);
		}
		return dto;
	}

	@Override
	public List<Patient> getPatientForDoctor(long id) {
		
		return null;
	}

	@Override
	public List<Appointment> getAppointmentForDoctor(long id) {
		
		return null;
	}

	@Override
	public Doctor deleteDoctorProfilePicture(long id) throws DoctorNotFoundException {
		Doctor doc = docRepo.findByDoctorId(id);
		if(docRepo.existsById(id)) {
			doc.setProfile_picture(null);
			docRepo.save(doc);
			return doc;
		}
		else {
			throw new DoctorNotFoundException("The doctor is not found by this Id.");
			
		}
	}

	@Override
	public Doctor addDoctorProfilePicture(long id, String profile_picture) throws DoctorNotFoundException {
		  if(docRepo.existsById(id)) {
		       Doctor doctor = docRepo.findByDoctorId(id);
		       doctor.setProfile_picture(profile_picture);
		       docRepo.save(doctor);
		       return doctor;  
		     }
		      else {
		            throw new DoctorNotFoundException("Doctor is not found by this Id. Try with a valid id.");
		        }
	}

	@Override
	public DoctorDto getDoctorDtoById(long id) throws DoctorNotFoundException {
		Doctor doctor = docRepo.findByDoctorId(id);
		if(docRepo.existsById(id)) {
			DoctorDto docDto = mapper.convertToDto(doctor);
			return docDto;
		
		}
		else {
		throw new DoctorNotFoundException("Doctor is not found by this id. Try with a valid id.");
		}
	}


	@Override
	public List<DoctorDto> getDoctorBySpeciality(String speciality) throws DoctorNotFoundException {
		List<DoctorDto> docsdto = new ArrayList<DoctorDto>();
		DoctorDto docdto = new DoctorDto();
		List<Doctor> docs = docRepo.findBySpeciality(speciality);
		for(Doctor e : docs)
		{
			docdto = mapper.convertToDto(e);
			docsdto.add(docdto);
		}
		if(docsdto.isEmpty()) {
			throw new DoctorNotFoundException("No doctor found by this speciality");
		}
		else {
			return docsdto;
			}
	}
		

	@Override
	public Availability getDoctorAvailability(long id, Day day)
	{
		if(docRepo.existsById(id))
		{
			return null;
		}
		return null;
	}
	
}
