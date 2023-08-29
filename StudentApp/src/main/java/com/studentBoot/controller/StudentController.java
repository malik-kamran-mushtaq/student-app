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
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.studentBoot.entity.Student;
import com.studentBoot.exceptions.ApiResponce;
import com.studentBoot.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		
		Student saveStudent = this.studentService.addStudent(student);
		return new ResponseEntity<Student>(saveStudent, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> allStudents = this.studentService.getAllStudents();
		return new ResponseEntity<List<Student>>(allStudents,HttpStatus.OK);
	}
	
	@GetMapping("/{studentId}")
	public ResponseEntity<Student> getStudentById(@PathVariable("studentId") int studentId) {
		Student studentById = this.studentService.getStudentById(studentId);
		return new ResponseEntity<Student>(studentById,HttpStatus.OK);
	}
	
	@PutMapping("/{studentId}")
	public ResponseEntity<Student> updateStudentById(@RequestBody Student student,@PathVariable int studentId) {
		Student updatedStudent = studentService.updateStudentById(student, studentId);
		return new ResponseEntity<Student>(updatedStudent,HttpStatus.OK);
	}
	
	@DeleteMapping("/{studentId}")
	public ResponseEntity<ApiResponce> deleteStudentById(@PathVariable("studentId") int studentId) {
		this.studentService.deleteStudentById(studentId);
		ApiResponce response=new ApiResponce();
		response.setMessage("Student record is deleted successfully with Student ID:"+studentId);
		
		return new ResponseEntity<ApiResponce>(response,HttpStatus.OK);
	}
	

}
