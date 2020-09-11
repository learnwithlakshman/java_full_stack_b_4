package com.careerit.cj.day20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CsvUtil {

	private static String filePath = "task_1/coursedata.csv";

	public static List<Student> loadDataFromCSV() {
		List<Student> list = new ArrayList<Student>();
		try {
			List<String> lines = Files.readAllLines(Paths.get(filePath));
			list = lines.stream().skip(1).map(line -> convertLineToStudent(line)).collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return list;
	}

	private static Student convertLineToStudent(String line) {
		String[] arr = line.split(",");
		int c = 0;
		String name = arr[c++];
		String batch = arr[c++];
		String ccStatus = arr[c++];
		String pStatus = arr[c++];
		String qualification = arr[c++];
		double score = Double.parseDouble(arr[c++]);

		Student student = new Student(name, batch, ccStatus, pStatus, qualification, score);
		return student;

	}
}
