package com.appointment_service.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointment_service.entites.Appointment;
import com.appointment_service.entites.Vitals;
import com.appointment_service.exception.AppointmentNotFoundException;
import com.appointment_service.exception.VitalAlreadyPresentException;
import com.appointment_service.exception.VitalsNotFoundException;
import com.appointment_service.repository.IAppointmentRepository;
import com.appointment_service.repository.VitalsRepository;
import com.appointment_service.service.VitalsService;

@Service
public class VitalServiceImpl implements VitalsService{
	
	@Autowired
	private VitalsRepository vitalsRepo;
	
	@Autowired
	private IAppointmentRepository appointmentRepo;
	
	@Override
	public List<Vitals> getVitals() throws VitalsNotFoundException {
      List<Vitals> list=new ArrayList<Vitals>();
      list=vitalsRepo.findAll();
      if(list.size()>0) {
    	  return list;
      }
      else {
    	  throw new VitalsNotFoundException();
      }
		}

	// get Vitals by vital id
	@Override
	public Vitals getVitalsById(long vitalsId) throws VitalsNotFoundException {
		if (vitalsRepo.existsById(vitalsId)) {
			return vitalsRepo.findByvitalId(vitalsId);

		} else {
			throw new VitalsNotFoundException();
		}

	}

	// save Vitals or add vitals by vital id
	@Override
	public Vitals saveVital(Vitals vital) throws VitalAlreadyPresentException{

		if (vitalsRepo.existsById(vital.getId())) {
			throw new VitalAlreadyPresentException();
		}

		else {
			return vitalsRepo.save(vital);
		}
	}

	// update vitals by id by vital id
	@Override
	public Vitals updateVital(long vitalsId, Vitals vital) throws VitalsNotFoundException {

		if (vitalsRepo.existsById(vitalsId)) {
			Vitals v = vitalsRepo.findByvitalId(vitalsId);
			v.setECG(vital.getECG());
			v.setDiabetes(vital.getDiabetes());
			v.setTemperature(vital.getTemperature());
			v.setRespiration_rate(vital.getRespiration_rate());
			vitalsRepo.save(v);
			return vital;
		} else {

			throw new VitalsNotFoundException();
		}
	}

	@Override
	public Vitals addVitalsToAppointmentId(long id, Vitals vital) throws AppointmentNotFoundException {
		if(!appointmentRepo.existsById(id)) {
			throw new AppointmentNotFoundException();
		}
		else {
			Appointment a=appointmentRepo.getAppointmentById(id);
			
			if(vitalsRepo.existsById(vital.getId())) {
				a.setVitals(vitalsRepo.findByvitalId(vital.getId()));
				return vital;
			}
			else {
				Vitals vital1 = vitalsRepo.save(vital);
				a.setVitals(vital1);
				 appointmentRepo.save(a);
				return vital;
			
	}
	}}
}
