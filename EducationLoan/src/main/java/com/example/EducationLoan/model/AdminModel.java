package com.example.EducationLoan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class AdminModel {
	
	@Id
	@Column(name="Email")
	private String email;
	@Column(name="Password")
	private String password;
	@Column(name="MobileNumber")
	private String  mobilenumber;
	@Column(name="UserRole")
	private String userrole;
	
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "AdminModel [email=" + email + ", password=" + password + ", mobilenumber=" + mobilenumber
				+ ", userrole=" + userrole + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword()
				+ ", getMobilenumber()=" + getMobilenumber() + ", getUserrole()=" + getUserrole() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public AdminModel() {
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
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}

}
