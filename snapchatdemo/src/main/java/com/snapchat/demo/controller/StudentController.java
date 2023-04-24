package com.snapchat.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.snapchat.demo.model.Student;
import com.snapchat.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studService;
	
	@GetMapping(value="/fetchStudent")
	public List<Student> getAllStudents()
	{
		List<Student>studList=studService.getAllStudents();
		return studList;
	}
	//http://localhost:9080/saveStudent

@PostMapping(value="/saveStudent")
public Student saveStudent(@RequestBody Student s)
{
	return studService.saveStudent(s);
}
@PutMapping(value="/updateStudent")
public Student updateStudent(@RequestBody Student s)
{
	return studService.updateStudent(s);
}
@DeleteMapping("/deleteStudent/{rno}")
public void deleteStudent(@PathVariable("rno") int regno)
{
	studService.deleteStudent(regno); 
}
}