package com.studentBoot.student;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.studentBoot.entity.Student;
import com.studentBoot.repository.StudentRepository;

@SpringBootTest
public class StudentRepositoryTest {
	
	@Autowired
	private StudentRepository underTest;
	
	
	@Test
	void studentEmailExists() {
		String studentEmail = "kamran@gmail.com";
		//Student student = new Student(1, "Nilesh", studentEmail, "nilesh1122", 24, "CSE");
		
		
		//underTest.save(student);
		boolean expected = underTest.studentEmailExists(studentEmail);
		assertThat(expected).isTrue();
		
		
		
	}

}
