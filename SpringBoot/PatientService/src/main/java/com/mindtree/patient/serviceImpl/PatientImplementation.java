package com.mindtree.patient.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mindtree.patient.Repository.PatientRepository;
import com.mindtree.patient.entity.Patient;
import com.mindtree.patient.service.PatientService;

@Component
public class PatientImplementation implements PatientService
{
	

	@Autowired
	private PatientRepository patientrepository;

	@Override
	public Patient ShowPatientInformation(Integer id) 
	{
		
		return patientrepository.findById(id).get();
	}

	@Override
	public Patient SavePatientInformation(Patient patient) 
	{
		
		return patientrepository.save(patient);
	}
		
	
}
