package com.example.EducationLoan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EducationLoan.model.LoginModel;

@Repository
public interface LoginRepo extends JpaRepository<LoginModel,String>{

	void deleteByPassword(String password);

}
