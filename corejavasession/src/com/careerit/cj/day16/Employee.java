package com.careerit.cj.day16;

public class Employee {

	private int empno;
	private String name;
	private String qualification;
	private double salary;
	
	public Employee(String name, String qualification) {
		this(name, qualification,0);
	}

	public Employee(String name, String qualification, double salary) {
		this(0, name, qualification, salary);
	}

	public Employee(int empno, String name, String qualification, double salary) {
		this.empno = empno;
		this.name = name;
		this.qualification = qualification;
		this.salary = salary;
	}

	public void showDetails() {
		System.out.println(String.format("Empno : %d \nEname : %s \nQualification : %s \nSalary : %f ", empno, name,
				qualification, salary));
	}

}
