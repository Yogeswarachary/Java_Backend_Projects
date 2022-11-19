package com.jobseekerprofile.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.jobseekerprofile.exception.AreaOfInterestIdNotFoundException;
import com.jobseekerprofile.exception.AreaOfIntrestNotExistException;
import com.jobseekerprofile.exception.BasicEducationNotFoundException;
import com.jobseekerprofile.exception.CertificateNotFoundException;
import com.jobseekerprofile.exception.DuplicateAreaOfIntrestException;
import com.jobseekerprofile.exception.DuplicateJobRolesException;
import com.jobseekerprofile.exception.DuplicateLanguagesException;
import com.jobseekerprofile.exception.DuplicateSkillsException;
import com.jobseekerprofile.exception.DuplicateWorkLocationException;
import com.jobseekerprofile.exception.HigherEducationNotFoundException;
import com.jobseekerprofile.exception.JobSeekerNotFoundException;
import com.jobseekerprofile.exception.JobSeekerProfileNotFoundException;
import com.jobseekerprofile.exception.LanguageNotFoundException;
import com.jobseekerprofile.exception.MarksNotFoundException;
import com.jobseekerprofile.exception.NullAreaOfIntrestException;
import com.jobseekerprofile.exception.NullCertificatesException;
import com.jobseekerprofile.exception.NullEducationDetailException;
import com.jobseekerprofile.exception.NullJobRolesException;
import com.jobseekerprofile.exception.NullLanguagesException;
import com.jobseekerprofile.exception.NullProfilePicException;
import com.jobseekerprofile.exception.NullSkillsException;
import com.jobseekerprofile.exception.NullWorkLocationException;
import com.jobseekerprofile.exception.PersonalInfoIdNotFoundException;
import com.jobseekerprofile.exception.WorkLocationLimitException;
import com.jobseekerprofile.exception.WorkLocationNotFoundException;

@ControllerAdvice
@ResponseStatus
public class GlobalExceptions {
	
	@ExceptionHandler(AreaOfInterestIdNotFoundException.class)
	public ResponseEntity<?> areaOfInterestIdNotFoundExceptionHandler(AreaOfInterestIdNotFoundException areaOfIntrestId){
		ResponseEntity<?> response=new ResponseEntity<>("Area of intrest id not found", HttpStatus.NOT_FOUND);
		return response;
	}
	
	@ExceptionHandler(AreaOfIntrestNotExistException.class)
	public ResponseEntity<?> areaOfIntrestNotExistExceptionHandler(AreaOfIntrestNotExistException areaOfIntrestNotExist){
		ResponseEntity<?> response=new ResponseEntity<>("Area of of intrest does not exist", HttpStatus.BAD_REQUEST);
		return response;
	}
	
	@ExceptionHandler(BasicEducationNotFoundException.class)
	public ResponseEntity<?> basicEducationNotFoundExceptionHandler(BasicEducationNotFoundException basicEdu) {
		ResponseEntity<?> response=new ResponseEntity<>("Basic education not found Exception", HttpStatus.NOT_FOUND);
		return response;
	}
	
	@ExceptionHandler(CertificateNotFoundException.class)
	public ResponseEntity<?> certificateNotFoundExceptionHandler(CertificateNotFoundException certificateNotFound){
		ResponseEntity<?> response=new ResponseEntity<>("Certificate not found",HttpStatus.NOT_FOUND);
		return response;
	}
	
	@ExceptionHandler(DuplicateAreaOfIntrestException.class)
	public ResponseEntity<?> duplicateAreaOfIntrestHandler(DuplicateAreaOfIntrestException duplicateAreaOfIntrest){
		ResponseEntity<?> response=new ResponseEntity<> ("Duplicate Area of intrest exception", HttpStatus.CONFLICT);
		return response;
	}
	
	@ExceptionHandler(DuplicateJobRolesException.class)
	public ResponseEntity<?> duplicateJobRolesExceptionHandler(DuplicateJobRolesException duplicateJobRoles){
		ResponseEntity<?> response=new ResponseEntity<>("Duplicate job roles exception", HttpStatus.CONFLICT);
		return response;
	}
	
	@ExceptionHandler(DuplicateLanguagesException.class)
	public ResponseEntity<?> duplicateLanguagesExceptionHandler(DuplicateLanguagesException duplicateLanguages) {
		ResponseEntity<?> response=new ResponseEntity<>("Duplicate languages exception", HttpStatus.CONFLICT);
		return response;
	}
	
	@ExceptionHandler(DuplicateSkillsException.class)
	public ResponseEntity<?> duplicateSkillsExceptionHandler(DuplicateSkillsException duplicateSkills){
		ResponseEntity<?> response=new ResponseEntity<>("Duplicate skills Exception", HttpStatus.CONFLICT);
		return response;
	}
	
	@ExceptionHandler(DuplicateWorkLocationException.class)
	public ResponseEntity<?> duplicateWorkLocationExceptionHandler(DuplicateWorkLocationException duplicateWorkLocation){
		ResponseEntity<?> response=new ResponseEntity<>("Duplicate work location exception", HttpStatus.CONFLICT);
		return response;
	}
	
	@ExceptionHandler(HigherEducationNotFoundException.class)
	public ResponseEntity<?> higherEducationNotFoundExceptionHandler(HigherEducationNotFoundException higherEducation){
		ResponseEntity<?> response=new ResponseEntity<>("Higher education not found Exception", HttpStatus.NOT_FOUND);
		return response;
	}
	
	@ExceptionHandler(JobSeekerNotFoundException.class)
	public ResponseEntity<?> jobSeekerNotFoundExceptionHandler(JobSeekerNotFoundException jobSeekerNotFound){
		ResponseEntity<?> response=new ResponseEntity<>("JobSeeker not found exception", HttpStatus.NOT_FOUND);
		return response;
	}
	
	@ExceptionHandler(JobSeekerProfileNotFoundException.class)
	public ResponseEntity<?> jobSeekerProfileNotFoundExceptionHandler(JobSeekerProfileNotFoundException jobSeekerProfileNotFound) {
		ResponseEntity<?> response=new ResponseEntity<>("JobSeeker profile not found exception", HttpStatus.NOT_FOUND);
		return response;
	}
	
	@ExceptionHandler(LanguageNotFoundException.class)
	public ResponseEntity<?> languageNotFoundExceptionHandler(LanguageNotFoundException languageNotFound){
		ResponseEntity<?> response=new ResponseEntity<>("Language Not found exception", HttpStatus.NOT_FOUND);
		return response;
	}
	
	@ExceptionHandler(MarksNotFoundException.class)
	public ResponseEntity<?> marksNotFoundExceptionHandler(MarksNotFoundException marksNotFound){
		ResponseEntity<?> response=new ResponseEntity<>("Marks not found", HttpStatus.NOT_FOUND);
		return response;
	}
	
	@ExceptionHandler(NullAreaOfIntrestException.class)
	public ResponseEntity<?> nullAreaOfIntrestExceptionHandler(NullAreaOfIntrestException nullAreaOfIntrest){
		ResponseEntity<?> response=new ResponseEntity<>("Area of intrest is null exceptin", HttpStatus.BAD_REQUEST);
		return response;
	}
	
	@ExceptionHandler(NullCertificatesException.class)
	public ResponseEntity<?> nullCertificatesExceptionHandler(NullCertificatesException nullCertificates){
		ResponseEntity<?> response=new ResponseEntity<>("Null certificates exception", HttpStatus.BAD_REQUEST);
		return response;
	}
	
	@ExceptionHandler(NullEducationDetailException.class)
	public ResponseEntity<?> nullEducationDetailExceptionHandler(NullEducationDetailException nullEducation){
		ResponseEntity<?> response=new ResponseEntity<>("Null education details", HttpStatus.BAD_REQUEST);
		return response;
	}
	
	@ExceptionHandler(NullJobRolesException.class)
	public ResponseEntity<?> nullJobRolesExceptionHandler(NullJobRolesException nullJobRoles){
		ResponseEntity<?> response=new ResponseEntity<>("Null job roles exception", HttpStatus.BAD_REQUEST);
		return response;
	}
	
	@ExceptionHandler(NullLanguagesException.class)
	public ResponseEntity<?> nullLanguagesExceptionHnadler(NullLanguagesException nullLanguages){
		ResponseEntity<?> response=new ResponseEntity<>("Null languages exception", HttpStatus.BAD_REQUEST);
		return response;
	}
	
	@ExceptionHandler(NullProfilePicException.class)
	public ResponseEntity<?> nullProfilePicExceptionHandler(NullProfilePicException nullProfilePic){
		ResponseEntity<?> response=new ResponseEntity<>("Null profile picture exception", HttpStatus.BAD_REQUEST);
		return response;
	}
	
	@ExceptionHandler(NullSkillsException.class)
	public ResponseEntity<?> nullSkillsExceptionHandler(NullSkillsException nullSkills){
		ResponseEntity<?> response=new ResponseEntity<>("Null skills exception", HttpStatus.BAD_REQUEST);
		return response;
	}
	
	@ExceptionHandler(NullWorkLocationException.class)
	public ResponseEntity<?> nullWorkLocationExceptionHandler(NullWorkLocationException nullWorkLocation){
		ResponseEntity<?> response=new ResponseEntity<>("Null work location exception", HttpStatus.BAD_REQUEST);
		return response;
	}
	
	@ExceptionHandler(PersonalInfoIdNotFoundException.class)
	public ResponseEntity<?> personalInfoIdNotFoundExceptionHandler(PersonalInfoIdNotFoundException personalIdNotFound){
		ResponseEntity<?> response=new ResponseEntity<>("Personal id not found exception", HttpStatus.NOT_FOUND);
		return response;
	}
	
	@ExceptionHandler(WorkLocationLimitException.class)
	public ResponseEntity<?> workLocationLimitExceptionHandler(WorkLocationLimitException workLocationLimit){
		ResponseEntity<?> response=new ResponseEntity<>("Work location limit exception", HttpStatus.OK);
		return response;
	}
	
	@ExceptionHandler(WorkLocationNotFoundException.class)
	public ResponseEntity<?> workLocationNotFoundExceptionHandler(WorkLocationNotFoundException workLocationNotFound){
		ResponseEntity<?> response=new ResponseEntity<>("Work location not found exception", HttpStatus.NOT_FOUND);
		return response;
	}
}
