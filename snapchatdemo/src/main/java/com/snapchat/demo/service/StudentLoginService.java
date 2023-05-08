package com.snapchat.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snapchat.demo.dao.StudentLoginRepository;
//import com.snapchat.demo.model.Student;
import com.snapchat.demo.model.StudentLogin;
@Service
public class StudentLoginService {

	@Autowired
	private StudentLoginRepository objrepo;
	public String checkLogin(String username,String password)
	{
		StudentLogin user= objrepo.findByUsername(username);
		if(user==null)
		{
			return "No user found";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login Succesfull";
			}
			else
			{
				return "Login Failed";
			}
		}
	} 
	public StudentLogin addUser(StudentLogin cl)
	{
		return objrepo.save(cl);
	}
	public List<StudentLogin> getUser()
	{
		return objrepo.findAll();
	}
	public StudentLogin updateStudent(StudentLogin x)
	{
	    return objrepo.save(x);
	}
}
