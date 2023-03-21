package com.userCrud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Book")

public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private int bookId;
	@Column(name="Full name")
  private String fullname;
	@Column(name="Mobile number")
  private String mobilenumber;
	@Column(name="email")
  private String email;
	@Column(name="Specialists")
  private String specialists;
	@Column(name="Preferred doctor")
  private String doctor;
	@Column(name="Reason")
  private String reason;
	@Column(name="Appointment date")
  private String appointmentdate;
	@Column(name="Appointment time")
  private String appointmenttime;
	@Column(name="Address")
  private String address;
	public Book() {
		
	}
	public Book(int bookId, String fullname, String mobilenumber, String email, String specialists, String doctor,
			String reason, String appointmentdate, String appointmenttime, String address) {
		super();
		this.bookId = bookId;
		this.fullname = fullname;
		this.mobilenumber = mobilenumber;
		this.email = email;
		this.specialists = specialists;
		this.doctor = doctor;
		this.reason = reason;
		this.appointmentdate = appointmentdate;
		this.appointmenttime = appointmenttime;
		this.address = address;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSpecialists() {
		return specialists;
	}
	public void setSpecialists(String specialists) {
		this.specialists = specialists;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getAppointmentdate() {
		return appointmentdate;
	}
	public void setAppointmentdate(String appointmentdate) {
		this.appointmentdate = appointmentdate;
	}
	public String getAppointmenttime() {
		return appointmenttime;
	}
	public void setAppointmenttime(String appointmenttime) {
		this.appointmenttime = appointmenttime;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}