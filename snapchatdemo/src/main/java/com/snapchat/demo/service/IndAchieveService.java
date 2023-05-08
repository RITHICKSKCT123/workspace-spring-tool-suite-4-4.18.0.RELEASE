package com.snapchat.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snapchat.demo.dao.IndividualRepo;
import com.snapchat.demo.model.Individual;

@Service
public class IndAchieveService {
	
	@Autowired
	IndividualRepo indrepo;
	public Individual saveAuthor(Individual ind)
	{
		return indrepo.save(ind);
	}
	public List<Individual> getAllAuthors()
	{
		return indrepo.findAll();
	}

}
