package com.example.EducationLoan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EducationLoan.model.UserModel;

@Repository
public interface UserRepo extends JpaRepository<UserModel,Integer>{

}
