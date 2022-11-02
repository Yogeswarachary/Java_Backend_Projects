package com.clinicservice.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.clinicservice.entites.Clinic;
import com.clinicservice.entites.ServicesOffered;
import com.clinicservice.exception.ClinicAlreadyExistException;
import com.clinicservice.exception.ClinicNotFoundException;
import com.clinicservice.exception.ServiceAlreadyExistException;
import com.clinicservice.exception.ServiceNotFoundException;
import com.clinicservice.pojo.ServiceRequest;
import com.clinicservice.repository.ClinicRepository;
import com.clinicservice.repository.ServicesRepository;
import com.clinicservice.service.ServicesOfferedService;
import org.springframework.stereotype.Service;

@Service
public class ServicesOfferedServiceImpl implements ServicesOfferedService{
	
	@Autowired
	ServicesRepository serviceRepo;
	
	@Autowired
	ClinicRepository clinicRepo;
	
	@Override
	public ServicesOffered addService(ServiceRequest servR) throws ServiceAlreadyExistException {
		ServicesOffered serviceOff=new ServicesOffered();


		serviceOff.setServiceId(servR.getServiceId());
		serviceOff.setServiceName(servR.getServiceName());
		serviceOff.setServiceCode(servR.getServiceCode());
		serviceOff.setServiceDesc(servR.getServiceDesc());
		serviceOff.setAvgPrice(servR.getAvgPrice());
		serviceOff.setActive(servR.isActive());


		if(serviceRepo.existsById(servR.getServiceId())) {
			throw new ServiceAlreadyExistException();
		}
		else {
			serviceOff= serviceRepo.save(serviceOff);

			return serviceOff;
		}

	}

	@Override
	public ServicesOffered addServicesToClinics(long clinicId, long serviceId) throws ClinicAlreadyExistException,
			ServiceAlreadyExistException, ClinicNotFoundException, ServiceNotFoundException {
		boolean s=serviceRepo.existsById(serviceId);
		boolean c=clinicRepo.existsById(clinicId);

		if(s && c) {

			Clinic clinic=clinicRepo.getClinicObject(clinicId);
			ServicesOffered service=serviceRepo.getServiceObject(serviceId);
			if(clinic.getService().contains(service)) {
				throw new ServiceAlreadyExistException("Service Already Present");
			}
			else if(service.getClinic().contains(clinic)){
				throw new ClinicAlreadyExistException("Clinic Already Present");
			}
			else {
				clinic.getService().add(service);
				service.getClinic().add(clinic);
				clinicRepo.save(clinic);
				serviceRepo.save(service);

				return service;
			}
		}
		else if(!s){
			throw new ServiceNotFoundException("Service Not Found");
		}
		else {
			throw new ClinicNotFoundException("Clinic Not Found");
		}
	}
	
	
	@Override
	public List<ServicesOffered> viewServiceForClinic(long clinicId) throws ClinicNotFoundException {
		List<ServicesOffered> ser=null;
		if(clinicRepo.existsById(clinicId)) {
			ser=clinicRepo.getClinicObject(clinicId).getService();
		}
		else
		{
			throw new ClinicNotFoundException();
		}
		return ser;
	}
	
	@Override
    public ServicesOffered getServiceById(long serviceId) {
        ServicesOffered service = serviceRepo.getServiceObject(serviceId);
        return service;
    }
}
