package com.studentBoot;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentAppApplicationTests {
	
	Arithmatics c = new Arithmatics();

	@Test
	void contextLoads() {
	}
	
	@Test
	void testSum() {
		
		//expected result
		int expectedResult = 24;
		
		//actual result
		int actualResult = c.sum(12, 4, 8);
		
		assertThat(actualResult).isEqualTo(expectedResult);
	}

}
