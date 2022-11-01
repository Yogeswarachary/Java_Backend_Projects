package com.patientservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.patientservice.dto.PatientDTO;
import com.patientservice.entites.Patient;

@Mapper
public interface PatientMapper {
	
	@Mapping(source = "patient.patientId" , target = "patientId")
    @Mapping(source = "patient.patientName" , target = "patientName")
    @Mapping(source = "patient.patientPhone" , target = "patientPhone")
    @Mapping(source = "patient.patientLocation" , target = "patientLocation")
    @Mapping(source = "patient.patientImageUrl" , target = "patientImageUrl")
    @Mapping(source = "patient.patientAge" , target = "patientAge")
    @Mapping(source = "patient.patientMail" , target = "patientMail")
    @Mapping(source = "patient.patientBloodgroup" , target = "patientBloodgroup")
    @Mapping(source = "patient.patientHeight" , target = "patientHeight")
    @Mapping(source = "patient.patientGender" , target = "patientGender")
    @Mapping(source = "patient.title" , target = "title")
    @Mapping(source = "patient.patientDOB",target = "patientDOB")
    @Mapping(source = "patient.allergie",target = "allergie")
    @Mapping(source = "patient.activeIssue",target = "activeIssue")
    @Mapping(source = "patient.medicalProblem",target = "medicalProblem")
    public PatientDTO converToDto(Patient patient);

    @Mapping(source = "patientId" , target = "patientId")
    @Mapping(source = "patientName" , target = "patientName")
    @Mapping(source = "patientPhone" , target = "patientPhone")
    @Mapping(source = "patientLocation" , target = "patientLocation")
    @Mapping(source = "patientImageUrl" , target = "patientImageUrl")
    @Mapping(source = "patientAge" , target = "patientAge")
    @Mapping(source = "patientMail" , target = "patientMail")
    @Mapping(source = "patientBloodgroup" , target = "patientBloodgroup")
    @Mapping(source = "patientHeight" , target = "patientHeight")
    @Mapping(source = "patientGender" , target = "patientGender")
    @Mapping(source = "title" , target = "title")
    @Mapping(source = "patientDOB",target = "patientDOB")
    @Mapping(source = "allergie",target = "allergie")
    @Mapping(source = "activeIssue",target = "activeIssue")
    @Mapping(source = "medicalProblem",target = "medicalProblem")
    public Patient converToEntity(PatientDTO patientDto);

}
