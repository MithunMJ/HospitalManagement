package com.mindtree.patient.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Patient 
{
	@Id
	@GeneratedValue
	private Integer Id;
	private String name;
	private Integer age;
	
	@Column(unique=true)
	private LocalDate date_of_visit;
	private String doctor_name;
	
	private String gender;
	private String prescription;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public LocalDate getDate_of_visit() {
		return date_of_visit;
	}
	public void setDate_of_visit(LocalDate date_of_visit) {
		this.date_of_visit = date_of_visit;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	public Patient(Integer id, String name, Integer age, LocalDate date_of_visit, String doctor_name, String gender,
			String prescription) {
		super();
		Id = id;
		this.name = name;
		this.age = age;
		this.date_of_visit = date_of_visit;
		this.doctor_name = doctor_name;
		this.gender = gender;
		this.prescription = prescription;
	}
	public Patient() {
		super();
	}
	@Override
	public String toString() {
		return "Patient [Id=" + Id + ", name=" + name + ", date_of_visit=" + date_of_visit + ", doctor_name="
				+ doctor_name + "]";
	}
	
	
	
	
	
	

}
