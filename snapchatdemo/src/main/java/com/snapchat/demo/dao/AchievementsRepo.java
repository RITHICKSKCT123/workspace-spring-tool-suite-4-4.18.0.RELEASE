package com.snapchat.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snapchat.demo.model.Achievements;

public interface AchievementsRepo extends JpaRepository<Achievements,Integer>{

}
