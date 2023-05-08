package com.snapchat.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Achievements {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Override
	public String toString() {
		return "Achievements [id=" + id + ", StudentAcievements=" + StudentAcievements + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentAcievements() {
		return StudentAcievements;
	}
	public void setStudentAcievements(String studentAcievements) {
		StudentAcievements = studentAcievements;
	}
	private String StudentAcievements;
}
