package com.studentBoot.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	
	@Column(nullable = false, length = 30)
	private String studentName;
	
	@Column(unique = true)
	private String studentEmail;
	
	@Column(nullable = false, length = 10)
	private String studentPassword;
	
	@Column(nullable = false)
	private int studentAge;
	
	@Column(nullable = false)
	private String studentClass;
	
	@OneToMany(mappedBy = "student1", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<CourseEntity> courseList=new ArrayList<>();
	
	
	
	public List<CourseEntity> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<CourseEntity> courseList) {
		this.courseList = courseList;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public Student(int i, String string, String string2, String string3, int j, String string4) {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StudentEntity [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail="
				+ studentEmail + ", studentPassword=" + studentPassword + ", studentAge=" + studentAge
				+ ", studentClass=" + studentClass + ", courseList=" + courseList + "]";
	}

	
	
	
	
	

}
