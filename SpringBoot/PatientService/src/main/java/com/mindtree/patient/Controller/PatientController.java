package com.mindtree.patient.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.patient.entity.Patient;
import com.mindtree.patient.service.PatientService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/patients")
public class PatientController 
{
	@Autowired
	private PatientService patientservice;
	
	@PostMapping("/patient")
	public Patient createPatient(@RequestBody Patient patient)
	{
		return patientservice.SavePatientInformation(patient);
	}
	
	@GetMapping("/patient/{id}")
	public Patient ShowPatientInformation(@PathVariable Integer Id)
	{
		return patientservice.ShowPatientInformation(Id);
	}

}
