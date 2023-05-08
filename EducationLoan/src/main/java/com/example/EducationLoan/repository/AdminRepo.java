package com.example.EducationLoan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EducationLoan.model.AdminModel;

@Repository
public interface AdminRepo extends JpaRepository<AdminModel,String>{

	void deleteByPassword(String password);
	

}
