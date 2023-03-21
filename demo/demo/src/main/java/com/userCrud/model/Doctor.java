package com.userCrud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private int doctorId;
	@Column(name="Doctor name")
  private String doctorname;
	@Column(name="Specialists")
  private String specialists;
	
	public Doctor() {
		
	}
	public Doctor(int doctorId, String doctorname, String specialists) {
		super();
		this.doctorId = doctorId;
		this.doctorname = doctorname;
		this.specialists = specialists;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getSpecialists() {
		return specialists;
	}
	public void setSpecialists(String specialists) {
		this.specialists = specialists;
	}
	
	
}