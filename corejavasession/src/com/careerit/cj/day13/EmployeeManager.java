package com.careerit.cj.day13;

final class Employee {

	private final int empno;
	private final String ename;
	private final double salary;

	public Employee(int empno, String ename, double salary) {
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}

	public Employee increment(double amount) {
		double after_increment = this.salary + amount;
		return new Employee(empno, ename, after_increment);
	}

	public Employee updateName(String upatedName) {
		return new Employee(empno, upatedName, salary);
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", salary=" + salary + "]";
	}

}

public class EmployeeManager {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1001, "Krish", 85000);
		System.out.println(emp1);
		Employee emp2 = emp1.increment(4999);
		System.out.println(emp2);
		System.out.println(emp1);
	}
}
