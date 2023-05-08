package com.snapchat.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.snapchat.demo.model.StudentLogin;
public interface StudentLoginRepository extends JpaRepository<StudentLogin, Integer>
{
	StudentLogin findByUsername(String username);
}



