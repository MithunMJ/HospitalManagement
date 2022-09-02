package com.mindtree.doctor.Implementation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mindtree.doctor.Entity.Doctor;
import com.mindtree.doctor.Repository.DoctorRepository;
import com.mindtree.doctor.service.DoctorService;

@Component
public class DoctorImplementation implements DoctorService 
{

	@Autowired
	private DoctorRepository doctorrepository;

	@Override
	public Doctor showDoctorInformation(String name) {
		
		return doctorrepository.findByName(name);
	}

	@Override
	public boolean saveDoctorInformation(Doctor doctor) {
		
		doctorrepository.save(doctor);
		return true;
	}

	@Override
	public List<Doctor> getDoctors() 
	{
		return (List<Doctor>)doctorrepository.findAll();
		
	}
	
	
}
