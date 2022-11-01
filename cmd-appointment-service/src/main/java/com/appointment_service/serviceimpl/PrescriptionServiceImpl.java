package com.appointment_service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointment_service.entites.Appointment;
import com.appointment_service.entites.Prescriptions;
import com.appointment_service.exception.AppointmentNotFoundException;
import com.appointment_service.exception.PrescriptionServiceException;
import com.appointment_service.repository.IAppointmentRepository;
import com.appointment_service.repository.IPrescriptionRepository;
import com.appointment_service.service.IPrescriptionService;

@Service
public class PrescriptionServiceImpl implements IPrescriptionService{
	
	@Autowired
	IPrescriptionRepository prescriptionRepo;
	
	@Autowired
	IAppointmentRepository appRepo;
	
	@Override
	public Prescriptions addPrescription(Prescriptions pre, long id) throws AppointmentNotFoundException{
		if(!appRepo.existsById(id)) {
			throw new AppointmentNotFoundException();
		}
		else {
			Appointment oldAppointment = appRepo.getAppointmentById(id);
			if(prescriptionRepo.existsById(pre.getPrescriptionId())) {
				oldAppointment.getPrescriptions().add(prescriptionRepo.getByPrescriptionId(pre.getPrescriptionId()));
				return pre;
			}
			else {
				prescriptionRepo.save(pre);
				oldAppointment.getPrescriptions().add(pre);			
                appRepo.save(oldAppointment);	
                return pre;
				
				}
			}
		}
		
	@Override
	public Prescriptions getOnePrescriprion(long id) throws PrescriptionServiceException {
         if(prescriptionRepo.existsById(id))
		return prescriptionRepo.getByPrescriptionId(id);
         else {
        	 throw new PrescriptionServiceException();
         }
				
				
	}

	// method for delete Prescriptions

	@Override
	public void deletePrescription(long prescriptionId) throws PrescriptionServiceException {

		if (prescriptionRepo.existsById(prescriptionId))
			prescriptionRepo.deleteById(prescriptionId);
		else
			throw new PrescriptionServiceException();

	}

	// method for edit Prescriptions
	@Override
	public Prescriptions editPrescription(long id, Prescriptions pre) throws PrescriptionServiceException {

	//	Prescriptions oldPre = iPrescriptionRepo.findById(id).orElseThrow(() -> new PrescriptionServiceException());
		if(!prescriptionRepo.existsById(id)) {
			throw new PrescriptionServiceException();
		}
		else { 
			Prescriptions oldPre = prescriptionRepo.getByPrescriptionId(id);
		oldPre.setDescription(pre.getDescription());
		oldPre.setDuration(pre.getDuration());
		oldPre.setMedicineCycle(pre.getMedicineCycle());
		oldPre.setMedicineName(pre.getMedicineName());
		oldPre.setTake_with_food(pre.isTake_with_food());

		return prescriptionRepo.save(oldPre);
	}}
	
	// getAll Prescriptions by AppointmentId
	@Override
	public List<Prescriptions> viewPrescriptionbyAppointmentId(long id) throws PrescriptionServiceException, AppointmentNotFoundException {
		if(appRepo.existsById(id)) {
		Appointment oldAppointment = appRepo.getAppointmentById(id);
		List<Prescriptions> preList=oldAppointment.getPrescriptions();
		if(preList.size()==0) {
			throw new PrescriptionServiceException();
		}
		return oldAppointment.getPrescriptions();
	}
	else {
		throw new AppointmentNotFoundException();
	}}


}

