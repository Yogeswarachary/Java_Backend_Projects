package com.jobseekerprofile.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobseekerprofile.entites.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long>{
	
	@Query(value="select s from Skill s")
	List<Skill> getSkills();
	
	@Query(value="select s from Skill s where s.description=:skill")
	Skill getSkillByProfileId(@Param("skill")String Skill);	

}
