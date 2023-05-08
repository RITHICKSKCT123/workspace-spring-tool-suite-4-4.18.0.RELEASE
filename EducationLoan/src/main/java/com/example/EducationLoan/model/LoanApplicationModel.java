package com.example.EducationLoan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class LoanApplicationModel {
	
	@Id
	@Column(name="loanId")
	 private int loanid;
	@Column(name="loantype")
	 private String loantype;
	public int getLoanid() {
		return loanid;
	}
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
	public String getLoantype() {
		return loantype;
	}
	public LoanApplicationModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public String getApplicationName() {
		return applicationName;
	}
	@Override
	public String toString() {
		return "LoanApplicationModel [loanid=" + loanid + ", loantype=" + loantype + ", applicationName="
				+ applicationName + ", applicantaddress=" + applicantaddress + ", applicantmobile=" + applicantmobile
				+ ", applicantemail=" + applicantemail + ", applicantaadhaar=" + applicantaadhaar + ", applicantpan="
				+ applicantpan + ", salary=" + salary + ", loanamountrequired=" + loanamountrequired
				+ ", loanrepaymentmonths=" + loanrepaymentmonths + ", getLoanid()=" + getLoanid() + ", getLoantype()="
				+ getLoantype() + ", getApplicationName()=" + getApplicationName() + ", getApplicantaddress()="
				+ getApplicantaddress() + ", getApplicantmobile()=" + getApplicantmobile() + ", getApplicantemail()="
				+ getApplicantemail() + ", getApplicantaadhaar()=" + getApplicantaadhaar() + ", getApplicantpan()="
				+ getApplicantpan() + ", getSalary()=" + getSalary() + ", getLoanamountrequired()="
				+ getLoanamountrequired() + ", getLoanrepaymentmonths()=" + getLoanrepaymentmonths() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	public String getApplicantaddress() {
		return applicantaddress;
	}
	public void setApplicantaddress(String applicantaddress) {
		this.applicantaddress = applicantaddress;
	}
	public String getApplicantmobile() {
		return applicantmobile;
	}
	public void setApplicantmobile(String applicantmobile) {
		this.applicantmobile = applicantmobile;
	}
	public String getApplicantemail() {
		return applicantemail;
	}
	public void setApplicantemail(String applicantemail) {
		this.applicantemail = applicantemail;
	}
	public String getApplicantaadhaar() {
		return applicantaadhaar;
	}
	public void setApplicantaadhaar(String applicantaadhaar) {
		this.applicantaadhaar = applicantaadhaar;
	}
	public String getApplicantpan() {
		return applicantpan;
	}
	public void setApplicantpan(String applicantpan) {
		this.applicantpan = applicantpan;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getLoanamountrequired() {
		return loanamountrequired;
	}
	public void setLoanamountrequired(String loanamountrequired) {
		this.loanamountrequired = loanamountrequired;
	}
	public String getLoanrepaymentmonths() {
		return loanrepaymentmonths;
	}
	public void setLoanrepaymentmonths(String loanrepaymentmonths) {
		this.loanrepaymentmonths = loanrepaymentmonths;
	}
	@Column(name="applicantName")
	 private String applicationName;
	@Column(name="applicantAddress")
	 private String applicantaddress;
	@Column(name="applicantMobile")
 private String applicantmobile;
	@Column(name="applicantEmail")
	 private String applicantemail;
	@Column(name="applicantAadhaar")
	 private String applicantaadhaar;
	@Column(name="Email")
	 private String applicantpan;
	@Column(name="applicantSalary")
	 private String salary;
	@Column(name="loanAmountRequired")
	 private String loanamountrequired;
	@Column(name="loanRepaymentMonths")
	 private String loanrepaymentmonths;

}
