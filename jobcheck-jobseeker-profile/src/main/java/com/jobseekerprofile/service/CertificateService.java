package com.jobseekerprofile.service;

import java.util.List;

import com.jobseekerprofile.entites.Certificate;
import com.jobseekerprofile.entites.CertificationDetail;
import com.jobseekerprofile.exception.CertificateNotFoundException;
import com.jobseekerprofile.exception.JobSeekerProfileNotFoundException;

public interface CertificateService {
	
	List<Certificate> getAllCertificate(long profileId) throws JobSeekerProfileNotFoundException;
	
	String editCertificate(long profileId, long certificateId, Certificate certificate);
	
	String deleteCertificate(long profileId, long certificateId) throws CertificateNotFoundException;
	
	Certificate addCertificateToProfile(long profileId, String certificateName, CertificationDetail certificationDetail);
	
	Certificate addCertificate(Certificate certificate);
}
