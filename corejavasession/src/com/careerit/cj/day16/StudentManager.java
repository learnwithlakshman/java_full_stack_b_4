package com.careerit.cj.day16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class StudentManager {

		public static void main(String[] args) throws IOException {
			
			List<String> lines = Files.readAllLines(Paths.get("task_1/coursedata.csv"));
			
			Student[] studentArr = new Student[lines.size()];

			for(int i=1,j=0;i<lines.size();i++,j++) {
				String line = lines.get(i);
				// Line => Student
				Student student=null;
				studentArr[j] = student;
				
			}
			
			
			// Print all student details
			
			// Get all student by given qualification
			
			// Get placed student details
			
			// Get total placed and not place student count
			
			// Get student details who has max score
			
			// Get student who are completed course but not got placed
			
		}
}
