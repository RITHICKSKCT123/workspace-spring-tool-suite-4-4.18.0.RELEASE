package com.snapchat.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.snapchat.demo.model.Student;



@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{
	//positional parameter
	@Query("select s from Student s where s.department=?1 and s.name=?2")
	public List <Student> getStudentByDepartment(String dept,String name);
	
	//named parameter
	@Query("select s from Student s where s.department=:dept")
	public List <Student> getStudentByDepartment(String dept);
	
	//DML
	@Modifying
	@Query("delete from Student s where s.name=?1")
	public int deleteStudentByName(String name);
	
	@Modifying
	@Query("update  Student s set s.department=?1 where s.name=?2")
	public int updateStudentByName(String department, String name);
	
	@Query(value="select * from student  s where  s.email= ?1", nativeQuery=true)
	public List<Student> fetchTeamByLoses(String  email);
	
    List<Student> findByNameStartingWith(String prefix);
    List<Student> findByNameEndingWith(String prefix);
    List<Student> findByDepartment(String prefix);
}
