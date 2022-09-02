package com.mindtree.patient.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.patient.entity.Patient;

@Service
public interface PatientService 
{
	public Patient ShowPatientInformation(Integer id);
	public Patient SavePatientInformation(Patient patient);
	

}
