package com.careerit.cj.day15;

public class Employee {

	private int empno;
	private String ename;
	private double salary;

	public Employee(int empno, String ename, double salary) {
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	public double getSalary() {
		return salary;
	}

	public void viewDetails() {
		StringBuilder sb = new StringBuilder();
		sb.append("Empno: ").append(empno).append("\nName: ").append(ename).append("\nSalary: ").append(salary);
		System.out.println(sb.toString());
	}

}
