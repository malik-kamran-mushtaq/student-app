package com.studentBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentBoot.entity.CourseEntity;
import com.studentBoot.exceptions.ApiResponce;
import com.studentBoot.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	
	@PostMapping("/")
	public ResponseEntity<CourseEntity> addCourse(@RequestBody CourseEntity course){
		CourseEntity addedCourse = this.courseService.addCourse(course);
		return new ResponseEntity<CourseEntity>(addedCourse,HttpStatus.CREATED);
	}
	//Get all courses a student is enrolled in
	@GetMapping("/student/{studentId}")
	public ResponseEntity<List<CourseEntity>> getAllCoursesEnrolledByStudent(@PathVariable int studentId){
		List<CourseEntity> coursesEnrolledByStudentId = this.courseService.getCoursesEnrolledByStudentId(studentId);
		return new ResponseEntity<List<CourseEntity>>(coursesEnrolledByStudentId,HttpStatus.OK);
	}
	
	//Get all the  courses
	@GetMapping("/")
	public ResponseEntity<List<CourseEntity>> getAllCourseList(){
		List<CourseEntity> allCourses = this .courseService.getAllCourses();
		return new ResponseEntity<List<CourseEntity>>(allCourses,HttpStatus.OK);
	}
	
	//Get Course by ID
	@GetMapping("/{courseId}")
	public ResponseEntity<CourseEntity> getCourseById(@PathVariable("courseId") int courseId) {
		CourseEntity getcoursebyId = this.courseService.getCourseById(courseId);
		return new ResponseEntity<CourseEntity>(getcoursebyId,HttpStatus.OK);
		
	}
	
	@PutMapping("/{courseId}")
	public ResponseEntity<CourseEntity> updateCourse(@RequestBody CourseEntity course, @PathVariable("courseId") int courseId){
		CourseEntity updatedCourse = this.courseService.updateCourseById(course, courseId);
		return new ResponseEntity<CourseEntity>(updatedCourse,HttpStatus.OK);
	}
	
	@DeleteMapping("/{courseId}")
	public ResponseEntity<ApiResponce> deleteCourseById(@PathVariable("courseId") int courseId){
		this.courseService.deleteCourse(courseId);
		ApiResponce response=new ApiResponce();
		response.setMessage("Course Record is deleted successfully");
		response.setStatus(true);
		return new ResponseEntity<ApiResponce>(response,HttpStatus.OK);
		
	}
	
	

}
