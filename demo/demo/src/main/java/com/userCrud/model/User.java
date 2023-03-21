package com.userCrud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User 

{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private int userId;
	@Column(name="fname")
  private String fname;
	@Column(name="phonenumber")
  private String phonenumber;
	@Column(name="email")
  private String email;
	@Column(name="password")
  private String password;
  
public User() {
	
}
public User(int userId, String fname, String lname, String password, String email) {
	super();
	this.userId = userId;
	this.fname = fname;
	this.phonenumber = phonenumber;
	this.email = email;
	this.password = password;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}

public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}


public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", fname=" + fname + ", phonenumber=" + phonenumber + ", email=" + email
			+ ", password=" + password + "]";
}

  
}
