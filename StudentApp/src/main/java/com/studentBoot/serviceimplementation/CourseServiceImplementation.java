package com.studentBoot.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentBoot.entity.CourseEntity;
import com.studentBoot.entity.Student;
import com.studentBoot.exceptions.ResourceNotFounndException;
import com.studentBoot.repository.CourseRepository;
import com.studentBoot.repository.StudentRepository;
import com.studentBoot.service.CourseService;

@Service
public class CourseServiceImplementation implements CourseService{

	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public CourseEntity addCourse(CourseEntity course) {
		// TODO Auto-generated method stub
		return this.courseRepository.save(course);
	}

	@Override
	public List<CourseEntity> getAllCourses() {
		// TODO Auto-generated method stub
		return this.courseRepository.findAll();
	}

	@Override
	public CourseEntity getCourseById(int courseId) {
		// TODO Auto-generated method stub
		if(!this.courseRepository.existsById(courseId))
		{
			throw new ResourceNotFounndException("Course","Course ID",courseId);
		}
		else {
			return this.courseRepository.findById(courseId).get();
			
		}
	}

	@Override
	public void deleteCourse(int courseId) {
		// TODO Auto-generated method stub
		if(!this.courseRepository.existsById(courseId))
		{
			throw new ResourceNotFounndException("Course","Course ID",courseId);
		}
		else {
			this.courseRepository.deleteById(courseId);
			
		}
		
	}

	@Override
	public CourseEntity updateCourseById(CourseEntity course, int courseId) {
		// TODO Auto-generated method stub
		if(!this.courseRepository.existsById(courseId))
		{
			throw new ResourceNotFounndException("Course","Course ID",course.getCourseId());
		}
		else {
			return this.courseRepository.save(course);
			
		}
	}

	@Override
	public List<CourseEntity> getCoursesEnrolledByStudentId(int studentId) {
		// TODO Auto-generated method stub
		Student studentObj = this.studentRepository.findById(studentId).orElseThrow(()-> new ResourceNotFounndException("Student","Student ID", studentId));
		return this.courseRepository.findByStudent1(studentObj);
	}

}
