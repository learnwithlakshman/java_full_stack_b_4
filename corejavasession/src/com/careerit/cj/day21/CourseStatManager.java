package com.careerit.cj.day21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

enum Status {
	Y, N
}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
class Student {
	private Status pStatus;
	private String batch;
	private String qualification;
	private String name;
	private Status ccStatus;
	private double score;
}

interface CourseStatService {

	Map<String, Integer> getCountForEachBatch();

	Map<String, List<Student>> getStudentOfEachBatch();
	List<Student> getStudentsByQualificaation(String qualificaation);
	Long getStudnetCountByQualification(String qualification);
	

}

class CourseStatServiceImpl implements CourseStatService {

	private List<Student> students;

	public CourseStatServiceImpl() {
		try {
			List<String> lines = Files.readAllLines(Paths.get("task_1/coursedata.csv"));
			students = lines.stream().skip(1).map(line -> converToStudent(line)).collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Map<String, Integer> getCountForEachBatch() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (Student student : students) {
			map.putIfAbsent(student.getBatch(), 0);
			map.put(student.getBatch(), map.get(student.getBatch()) + 1);
		}
		return map;
	}

	@Override
	public Map<String, List<Student>> getStudentOfEachBatch() {
		Map<String, List<Student>> map = new HashMap<>();
		for (Student student : students) {
			map.putIfAbsent(student.getBatch(), new ArrayList<Student>());
			List<Student> list = map.get(student.getBatch());
			list.add(student);
			map.put(student.getBatch(), list);
		}
		return map;
	}

	private Student converToStudent(String line) {
		int c = 0;
		String[] arr = line.split(",");
		String name = arr[c++];
		String batch = arr[c++];
		Status ccStatus = Status.valueOf(arr[c++]);
		Status pStatus = Status.valueOf(arr[c++]);
		String qualification = arr[c++];
		double score = Double.parseDouble(arr[c++]);
		Student student = Student.builder().name(name).batch(batch).qualification(qualification).pStatus(pStatus)
				.ccStatus(ccStatus).score(score).build();
		return student;

	}

	@Override
	public List<Student> getStudentsByQualificaation(String qualificaation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getStudnetCountByQualification(String qualification) {
		// TODO Auto-generated method stub
		return null;
	}

}

public class CourseStatManager {

	public static void main(String[] args) {

		CourseStatService service = new CourseStatServiceImpl();
		Map<String, Integer> map = service.getCountForEachBatch();
		map.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " " + entry.getValue());
		});
		
		Map<String, List<Student>> batchMap = service.getStudentOfEachBatch();
		batchMap.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " " + entry.getValue());
		});
		
//		1. Get all students whose qualification is BE/MCA/BSC ( Qualfication is paramater) 
//		2. Get count of all the students by qualification
//		3. Get count of students who got placed
//		4. Get count of student who completed course but not placed
//		5. Get count of placed and not placed student
//		6. Search student by the given name
//		7. Get average success rate of the given batch
//		8. Get max percentage scored Student details
//		9. Get all the student name only
//		10. Get all the student name,qualification,score 

		
	}
}
