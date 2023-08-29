package com.studentBoot.service;

import java.util.List;

import com.studentBoot.entity.CourseEntity;

public interface CourseService {
	
	//Add course
	public CourseEntity addCourse(CourseEntity course);
	
	//Get all courses
	public List<CourseEntity> getAllCourses();
	
	//Get course by id
	public CourseEntity getCourseById(int courseId);
	
	//Delete course by id
	public void deleteCourse(int courseId);
	
	//Update course
	public CourseEntity updateCourseById(CourseEntity course, int courseId);
	
	//List of courses enrolled by studentId
	public List<CourseEntity> getCoursesEnrolledByStudentId(int studentId);

}
