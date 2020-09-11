package com.careerit.cj.day20;

import java.util.List;

public interface CourseStat {

	public List<Student> studentsByQualification(String qualification);

	public int getStudentCountByQualification(String qualification);

	public int getPlacedStudentCount();

	public int getNotPlacedStudentCount();

	public CountDTO getPlacedAndNotPlacedCount();

	public List<Student> search(String str);

	public float successRate(String batchName);

	public List<Student> maxScoreStudent();

	public List<String> getStudentNames();

	public List<StudentDTO> getStudentDetails();

}