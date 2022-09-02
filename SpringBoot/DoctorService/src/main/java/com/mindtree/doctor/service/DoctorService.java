package com.mindtree.doctor.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.doctor.Entity.Doctor;

@Service
public interface DoctorService 
{
	public Doctor showDoctorInformation(String name);
	public boolean saveDoctorInformation(Doctor doctor);
	public List <Doctor> getDoctors();
	

}
