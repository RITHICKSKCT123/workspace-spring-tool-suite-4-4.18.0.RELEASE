package com.snapchat.demo.controller;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.snapchat.demo.model.Student;
import com.snapchat.demo.model.StudentLogin;
import com.snapchat.demo.service.StudentLoginService;
@RestController
@RequestMapping("/user")
public class StudentLoginController {
	
	@Autowired
	StudentLoginService objser;
	@PostMapping("/checklogin")
	public String login(@RequestBody Map<String,String>loginData)
	{
		String username=loginData.get("username");
		String password=loginData.get("password");
		String result=objser.checkLogin(username,password);
		return result;
	}
	@PostMapping("/adduser")
	public StudentLogin AddUser(@RequestBody StudentLogin cl)
	{
		return objser.addUser(cl);
	}

	@GetMapping
	public List<StudentLogin> listAll()
	{
		return objser.getUser();
	}
	@PutMapping("/updateLoginStudent")
	public StudentLogin updateStudent(@RequestBody StudentLogin x)
	{
		return objser.updateStudent(x);
	}
}
