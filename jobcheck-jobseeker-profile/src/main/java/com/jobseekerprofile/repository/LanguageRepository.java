package com.jobseekerprofile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobseekerprofile.entites.Language;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Long>{
	
	@Query("select e from Language e where e.languageId=:languageId")
	Language getById(@Param("languageId")long languageId);
	
	@Query("select l from Language l where l.language=:language")
	Language getLanguageByName(@Param("language") String language);

}
