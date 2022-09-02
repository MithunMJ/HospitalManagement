package com.mindtree.patient.VO;

import javax.persistence.Column;

public class Doctor 
{
	private Integer Id;
	private String name;
	private int age;
	private String gender;
	private String field;
	private int patientCount=0;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public int getPatientCount() {
		return patientCount;
	}
	public void setPatientCount(int patientCount) {
		this.patientCount = patientCount;
	}
	public Doctor(Integer id, String name, int age, String gender, String field, int patientCount) {
		super();
		Id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.field = field;
		this.patientCount = patientCount;
	}
	public Doctor() {
		super();
	}
	
	

}
