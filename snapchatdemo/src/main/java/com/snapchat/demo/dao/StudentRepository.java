package com.snapchat.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.snapchat.demo.model.Student;



@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
