package com.studentBoot.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentBoot.entity.Student;
import com.studentBoot.exceptions.ResourceNotFounndException;
import com.studentBoot.repository.StudentRepository;
import com.studentBoot.service.StudentService;

@Service
public class StudentServiceImplementation implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return this.studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return this.studentRepository.findAll();
	}

	@Override
	public Student getStudentById(int studentId) {
		// TODO Auto-generated method stub
		return this.studentRepository.findById(studentId).orElseThrow(()-> new ResourceNotFounndException("Student","Student ID", studentId));
	}

	@Override
	public Student updateStudentById(Student student, int studentId) {
		// TODO Auto-generated method stub
		if(!this.studentRepository.existsById(studentId)) {
			throw new ResourceNotFounndException("Student","Student ID", studentId);
		}
		//StudentEntity studentDb= this.studentRepository.findById(studentId).orElseThrow(()-> new ResourceNotFounndException("Student","Student ID", studentId));
		return this.studentRepository.save(student);
		
	}

	@Override
	public void deleteStudentById(int studentId) {
		// TODO Auto-generated method stub
		if(!this.studentRepository.existsById(studentId)) {
			throw new ResourceNotFounndException("Student","Student ID", studentId);
		}
		else {
			this.studentRepository.deleteById(studentId);
		}
		
	}

}
