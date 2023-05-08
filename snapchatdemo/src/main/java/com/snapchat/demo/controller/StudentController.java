 package com.snapchat.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
@GetMapping("/sortStudent/{field}")
public List<Student> sortStudent(@PathVariable String field)
{
	return studService.sortStudent(field);

}
@GetMapping("/sortdscStudent/{field}")
public List<Student> sortdscStudent(@PathVariable String field)
{
	return studService.sortdscStudent(field);

}
@GetMapping("/pagingStudent/{offset}/{pageSize}")
public Page<Student> pagingStudent(@PathVariable("offset") int offset,@PathVariable("pageSize") int pageSize)
{
	return studService.pagingStudent(offset, pageSize);

}
@GetMapping("/pagingAndSortingStudents/{offset}/{pageSize}/{field}")

public List<Student> pagingAndSortingEmployees(@PathVariable int offset,
		@PathVariable int pageSize,
		@PathVariable String field) 
{
	return studService.pagingAndSortingEmployees(offset, pageSize, field);
}
@GetMapping("/fetchStudentByNamePrefix/{Prefix}")
public List<Student> fetchStudentByNameName(@PathVariable String Prefix)
{
	return studService.fetchStudentByNamePrefix(Prefix);
}
@GetMapping("/saveStudentByNameSufix/{Sufix}")
public List<Student> saveStudentByNameName(@PathVariable String Sufix)
{
	return studService.saveStudentByNameSufix(Sufix);
}
@GetMapping("/saveStudentByDepartment/{dept}/{name}")
public List<Student> saveStudentByDepartment(@PathVariable String dept,@PathVariable String name)
{
	return studService.getStudentByDepartment(dept,name);
}
@DeleteMapping("/detele/{name}")
public String deleteStudentByName(@PathVariable String name)
{
	int result=studService.deleteStudentByName(name);
	if(result>0)
		return "Student record deleted";
	else
		return "Problem occured while deleting";
}
@PutMapping("/update/{department}/{name}")
public int updateStudentByName(@PathVariable String department,@PathVariable String name)
{
	return studService.updateStudentByName(department,name);
}
@GetMapping("/fetchTeamByEmail/{email}")
public List<Student> fetchTeamByLoses(@PathVariable String  email)
{
	return studService.fetchTeamByLoses(email);
} 
}