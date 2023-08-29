package com.studentBoot.service;

import java.util.List;

import com.studentBoot.entity.Student;

public interface StudentService {
	
	//To add a new record
	public Student addStudent(Student student);
	
	//To get all the students
	public List<Student> getAllStudents();
	
	//To get record of single student
	public Student getStudentById(int studentId);
	
	//Update student by Id
	public Student updateStudentById(Student student, int studentId);
	
	//Delete student record by Id
	public void deleteStudentById(int studentId);

}
