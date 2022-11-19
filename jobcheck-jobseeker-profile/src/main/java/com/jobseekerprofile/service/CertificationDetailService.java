package com.jobseekerprofile.service;

import com.jobseekerprofile.entites.CertificationDetail;

public interface CertificationDetailService {
	
	public CertificationDetail addCertificationDetail(long certificationId, CertificationDetail detail);
	
	public CertificationDetail addCertificationDetail(CertificationDetail detail);
	
	public CertificationDetail editCertificationDetails(long certificationId, CertificationDetail detail);
}
