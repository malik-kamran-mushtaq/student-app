package com.studentBoot.repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.studentBoot.entity.CourseEntity;
import com.studentBoot.entity.Student;

public interface CourseRepository extends JpaRepository<CourseEntity, Integer>{
	
	List<CourseEntity> findByStudent1(Student student);
	


}