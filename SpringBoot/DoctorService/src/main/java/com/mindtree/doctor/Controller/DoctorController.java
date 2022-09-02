package com.mindtree.doctor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.doctor.Entity.Doctor;
import com.mindtree.doctor.Repository.DoctorRepository;
import com.mindtree.doctor.service.DoctorService;



@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/doctors")
public class DoctorController 
{
	@Autowired
	private DoctorService doctorservice;
	
	@PostMapping("/doctor")
	public boolean addDoctor(@RequestBody Doctor doctor)
	{
		return doctorservice.saveDoctorInformation(doctor);
	}
	
	@GetMapping("/doc/{name}")
	public Doctor getDoctorInfo(@PathVariable String name)
	{
		return doctorservice.showDoctorInformation(name);
	}
	
	@GetMapping
	public List<Doctor> getListOfDoctor()
	{
		List<Doctor> doctors =doctorservice.getDoctors();
		return doctors;
	}
	

	
	
	
	
	
	
	
	
	

}
