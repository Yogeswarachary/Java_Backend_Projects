package com.appointment_service.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointment_service.entites.Appointment;
import com.appointment_service.entites.Recommendation;
import com.appointment_service.entites.Test;
import com.appointment_service.entites.Vitals;
import com.appointment_service.exception.AppointmentAlreadyExistsException;
import com.appointment_service.exception.AppointmentNotFoundException;
import com.appointment_service.exception.VitalsNotFoundException;
import com.appointment_service.repository.IAppointmentRepository;
import com.appointment_service.repository.RecommendationRepository;
import com.appointment_service.repository.TestRepository;
import com.appointment_service.repository.VitalsRepository;
import com.appointment_service.service.IAppointmentService;

@Service
public class AppointmentServiceImpl implements IAppointmentService{
	
	@Autowired
	IAppointmentRepository appRepo;
	
	@Autowired
	TestRepository tRepo;
	
	@Autowired
	RecommendationRepository repo;
	
	@Autowired
	VitalsRepository vitalRepo;
	
	@Override
	public List<Appointment> getAllAppointments() throws AppointmentNotFoundException{
		List<Appointment> appointments=appRepo.findAll();
		if(appointments.isEmpty()) {
			throw new AppointmentNotFoundException();
		}
		return appointments;
	}

	public Appointment addAppointment(Appointment appointment) throws AppointmentAlreadyExistsException {
		if (appRepo.existsById(appointment.getId())) {

			throw new AppointmentAlreadyExistsException();
		} else
			return appRepo.save(appointment);
	}

	@Override
	public Appointment getAppointmentById(long id) throws AppointmentNotFoundException {
		if(appRepo.existsById(id)) {
			Appointment appointment=appRepo.getAppointmentById(id);
			return appointment;
		} else
		throw new AppointmentNotFoundException("Appointment not found for this id");
	}

	@Override
	public void deleteTestsfoAppointment(long id, long testId) throws AppointmentNotFoundException {
		if(appRepo.getTestsForAppointment(id)==null) {
			throw new AppointmentNotFoundException("Appointment Not found");
		} else {
			Appointment t=appRepo.getAppointmentById(id);
			Test test=tRepo.getTestById(testId);
			System.out.println(test.getTestName());
			t.getTests().remove(test);
			appRepo.save(t);
		}
	}

	@Override
	public List<Test> getTestsForAppointment(long id) throws AppointmentNotFoundException {
		if(!appRepo.existsById(id)) {
			throw new AppointmentNotFoundException();
		} else {
			return appRepo.getAppointmentById(id).getTests();
		}
	}

	@Override
	public Appointment updateRecommendationAppo(Recommendation[] rec, long id) throws AppointmentNotFoundException {
		Appointment appointment=appRepo.getAppointmentById(id);
		Map<Long, Recommendation> recMap=new HashMap<Long, Recommendation>();
		
		for(Recommendation r:rec) {
			if(recMap.get(r.getDoctor().getId())==null) {
				recMap.put(r.getDoctor().getId(), r);
			}
		}
		
		List<Recommendation> recList=recMap.values().stream().collect(Collectors.toList());
		List<Recommendation> getAllRec=new ArrayList<>();
		for(int i=0;i<=recList.size()-1;i++) {
			getAllRec.add(recList.get(i));
		}
		appointment.setRecommendations(getAllRec);
		return appRepo.save(appointment);
	}

	@Override
	public void deleteRecommendationAppointment(long id, long recommendationId) throws AppointmentNotFoundException {
		
		if (appRepo.getAppointmentByIdForRecommendation(id) == null) {
			throw new AppointmentNotFoundException("Appointment not found.");
		} else {
			Appointment appointment = appRepo.getAppointmentById(id);
			Recommendation rec = repo.findById(recommendationId).get();
			System.out.println(rec.getDoctor());
			appointment.getRecommendations().remove(rec);
			appRepo.save(appointment);
		}
	}

	@Override
	public Vitals getVitalsbyAppoinmentId(long id) throws AppointmentNotFoundException {
		if(!appRepo.existsById(id)) {
			throw new AppointmentNotFoundException();
		} else {
			Appointment oldAppointment=appRepo.getAppointmentByIdForRecommendation(id);
			Vitals vital=oldAppointment.getVitals();
			return vital;
		}
		
	}

	@Override
	public Vitals editVitals(Vitals vital, long vitalsId) throws VitalsNotFoundException, AppointmentNotFoundException {
		Appointment oldAppointment=appRepo.findById(vitalsId)
				.orElseThrow(()-> new AppointmentNotFoundException("Vitals are not found for this application"));
		Vitals v=oldAppointment.getVitals();
		v.setECG(vital.getECG());
		v.setDiabetes(vital.getDiabetes());
		v.setTemperature(vital.getTemperature());
		v.setRespiration_rate(vital.getRespiration_rate());
		return vitalRepo.save(v);
	}

	@Override
	public Appointment getAllAppointment(long appointmnetId) throws AppointmentNotFoundException {
		List<Appointment> list = appRepo.findAll();
		if (list.size() <= 0) {
			throw new AppointmentNotFoundException("Data not found");
		} else {

			return appRepo.getAppointmentByIdForRecommendation(appointmnetId);
		}
	
	}

	@Override
	public int getAcceptedAppointments() {
		List<Appointment> acceptedAppointments=appRepo.findAll();
		ArrayList<Appointment> acceptedAppointments2=new ArrayList<>();
		for(Appointment appointment: acceptedAppointments) {
			if(appointment.getStatus().equalsIgnoreCase("Accepted")) {
				acceptedAppointments2.add(appointment);
			}
		}
		return acceptedAppointments2.size();
	}

	@Override
	public int getCancelledAppointments() {
		List<Appointment> appiAppointments = appRepo.findAll();
		ArrayList<Appointment> cancelAppiAppointments = new ArrayList<Appointment>();
		for (Appointment appointment : appiAppointments) {
			if (appointment.getStatus().equalsIgnoreCase("Cancelled")) {
				cancelAppiAppointments.add(appointment);
			}
		}
		return cancelAppiAppointments.size();
	}

	@Override
	public int gettotalAppointments() {
		return appRepo.findAll().size();
	}

	@Override
	public List<Appointment> getfilterconfirmedAppointments() throws AppointmentNotFoundException {
		List<Appointment> appointments = appRepo.findAll();
		ArrayList<Appointment> confirmedAppointments = new ArrayList<Appointment>();
		for (Appointment appointment : appointments) {
			if (appointment.getStatus().equalsIgnoreCase("accepted")) {
				confirmedAppointments.add(appointment);
			}
		}
		if (confirmedAppointments.isEmpty()) {
			throw new AppointmentNotFoundException("No Confirmed Appointments Found");
		} else
			return confirmedAppointments;
	}

	@Override
	public List<Appointment> getfiltercancelledAppointments() throws AppointmentNotFoundException {
		List<Appointment> appointments = appRepo.findAll();
		ArrayList<Appointment> cancelledAppointments = new ArrayList<Appointment>();
		for (Appointment appointment : appointments) {
			if (appointment.getStatus().equalsIgnoreCase("Cancelled")) {
				cancelledAppointments.add(appointment);
			}
		}
		if (cancelledAppointments.isEmpty()) {
			throw new AppointmentNotFoundException("No Cancelled Appointments Found");
		} else
			return cancelledAppointments;
	}

	@Override
	public List<Appointment> getfilterclosedAppointments() throws AppointmentNotFoundException {
		List<Appointment> appointments = appRepo.findAll();
		ArrayList<Appointment> closedAppointments = new ArrayList<Appointment>();
		for (Appointment appointment : appointments) {
			if (appointment.getStatus().equalsIgnoreCase("Closed")) {
				closedAppointments.add(appointment);
			}
		}
		if (closedAppointments.isEmpty()) {
			throw new AppointmentNotFoundException("No Cancelled Appointments Found");
		} else
			return closedAppointments;
	}

	@Override
	public Appointment updateAppointmnet(long id, String status) {
		Appointment myPatient = appRepo.getAppointmentById(id);
		myPatient.setStatus(status);
		return appRepo.save(myPatient);
	}

	@Override
	public void deleteAppointment(long id) throws AppointmentNotFoundException {
		if (appRepo.existsById(id)) {
			appRepo.deleteById(id);
		} else
			throw new AppointmentNotFoundException();		
	}

	@Override
	public List<Appointment> getpendingAppointments() throws AppointmentNotFoundException {
		List<Appointment> appointments = appRepo.findAll();
		ArrayList<Appointment> pendingAppointments = new ArrayList<Appointment>();
		for (Appointment appointment : appointments) {
			if (appointment.getStatus().equalsIgnoreCase("pending")) {
				pendingAppointments.add(appointment);
			}
		}
		if (pendingAppointments.isEmpty()) {
			throw new AppointmentNotFoundException();
		} else
			return pendingAppointments;
	}
	
	
}
