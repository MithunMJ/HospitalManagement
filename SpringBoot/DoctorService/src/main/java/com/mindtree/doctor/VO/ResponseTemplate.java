package com.mindtree.doctor.VO;

import java.util.ArrayList;

import com.mindtree.doctor.Entity.Doctor;

import antlr.collections.List;

public class ResponseTemplate 
{
	private Doctor doctor;
	private ArrayList<Patient> doctorList = new ArrayList<Patient>();
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public ArrayList<Patient> getDoctorList() {
		return doctorList;
	}
	public void setDoctorList(ArrayList<Patient> doctorList) {
		this.doctorList = doctorList;
	}
	public ResponseTemplate(Doctor doctor, ArrayList<Patient> doctorList) {
		super();
		this.doctor = doctor;
		this.doctorList = doctorList;
	}
	public ResponseTemplate() {
		super();
	}

	
}
