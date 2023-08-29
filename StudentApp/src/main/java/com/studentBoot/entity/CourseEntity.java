package com.studentBoot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "course")
public class CourseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courseId;
	
	@Column(nullable = false, length = 20)
	private String courseName;
	
	@Column(nullable = false, length = 20)
	private String courseDuration;
	
	@Column(nullable = false, length = 20)
	private int courseFee;
	
	@ManyToOne
	@JoinColumn(name = "sid")
	//@JsonIgnore
	private Student student1;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}
	

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}

	public int getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}

	public Student getStudent() {
		return student1;
	}

	public void setStudent(Student student) {
		this.student1 = student;
	}

	public CourseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CourseEntity [courseId=" + courseId + ", courseName=" + courseName + ", courseDuration="
				+ courseDuration + ", courseFee=" + courseFee + ", student1=" + student1 + "]";
	}
	
	
	
	
	

}
