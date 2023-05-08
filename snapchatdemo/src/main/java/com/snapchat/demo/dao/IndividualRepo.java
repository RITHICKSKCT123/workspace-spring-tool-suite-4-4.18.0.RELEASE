package com.snapchat.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snapchat.demo.model.Individual;

public interface IndividualRepo extends JpaRepository <Individual,Integer>{

}
