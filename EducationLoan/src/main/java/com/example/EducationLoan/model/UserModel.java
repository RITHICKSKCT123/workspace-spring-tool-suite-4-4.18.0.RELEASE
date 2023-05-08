package com.example.EducationLoan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class UserModel {
	
	@Id

	@Column(name="Id")
	private int id;
	@Column(name="Email")
	private String email;
	@Column(name="Password")
	private String password;
	@Column(name="MobileNumber")
	private String mobilenumber;
	@Column(name="UserRole")
	private String userrole;
	@Override
	public String toString() {
		return "LoanApplicationModel [id=" + id + ", email=" + email + ", password=" + password + ", username="
				+ username + ", mobilenumber=" + mobilenumber + ", userrole=" + userrole + ", getId()=" + getId()
				+ ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword() + ", getUsername()=" + getUsername()
				+ ", getMobilenumber()=" + getMobilenumber() + ", getUserrole()=" + getUserrole() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String username;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
