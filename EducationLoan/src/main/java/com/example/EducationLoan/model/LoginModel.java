package com.example.EducationLoan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class LoginModel {
	
	@Id
	@Column(name="Id")
	@GeneratedValue
	private int id;
	@Column(name="Email")
	private String email;
	@Column(name="Password")
	private String password;
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "LoginModel [email=" + email + ", password=" + password + ", getEmail()=" + getEmail()
				+ ", getPassword()=" + getPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public LoginModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
