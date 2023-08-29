package com.studentBoot.repository;

import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.studentBoot.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
 	@Query("SELECT CASE WHEN COUNT(s) > 0 THEN TRUE ELSE FALSE END FROM Student s WHERE s.studentEmail = ?1")
	Boolean studentEmailExists(String studentEmail);
	
	

}
