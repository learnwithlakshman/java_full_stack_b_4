package com.careerit.cj.day20;

import java.util.List;
import java.util.stream.Collectors;

public class CourseStatImpl implements CourseStat{

	private List<Student> studentList;
	
	public CourseStatImpl() {
		studentList = CsvUtil.loadDataFromCSV();
	}
	
	@Override
	public List<Student> studentsByQualification(String qualification) {
		return studentList.stream()
				.filter(s->s.getQualification()
				.equalsIgnoreCase(qualification))
				.collect(Collectors.toList());
	}

	@Override
	public int getStudentCountByQualification(String qualification) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPlacedStudentCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNotPlacedStudentCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CountDTO getPlacedAndNotPlacedCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> search(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float successRate(String batchName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> maxScoreStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getStudentNames() {
		return studentList.stream().map(s->s.getName()).collect(Collectors.toList());
	}

	@Override
	public List<StudentDTO> getStudentDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
