package com.careerit.cj.day20;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CourseStatImplTest {

	
		private CourseStat courseStat;
		@BeforeEach
		void init() {
			courseStat = new CourseStatImpl();
		}
		
		@Test
		void getStudentNamesTest() {
				List<String> names = courseStat.getStudentNames();
				names.stream().forEach(n->System.out.println(n));
				assertEquals(526, names.size());
		}
		
		@Test
		void studentsByQualificationTest() {
			String qualification = "B com";
			 List<Student> students = courseStat.studentsByQualification(qualification);
			 System.out.println(students);
			 assertEquals(1, students.size());
		}
}
