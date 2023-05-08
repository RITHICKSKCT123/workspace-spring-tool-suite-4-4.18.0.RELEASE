package com.snapchat.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snapchat.demo.dao.PersonRepo;
import com.snapchat.demo.model.Person;
@Service
public class PersonService
{
@Autowired
 PersonRepo prepo;
 public List<Person> getPerson()
 {
	 return prepo.findAll();
 }
 public Person postPerson(Person p)
 {
	 return prepo.save(p);
 }
}
