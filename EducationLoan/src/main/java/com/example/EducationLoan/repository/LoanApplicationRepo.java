package com.example.EducationLoan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EducationLoan.model.LoanApplicationModel;
@Repository
public interface LoanApplicationRepo extends JpaRepository<LoanApplicationModel,Integer>{

}
