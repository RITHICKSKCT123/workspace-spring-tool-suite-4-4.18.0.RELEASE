package com.snapchat.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.snapchat.demo.model.Person;
@Repository
public interface PersonRepo extends JpaRepository<Person,Long>
{
 
}
