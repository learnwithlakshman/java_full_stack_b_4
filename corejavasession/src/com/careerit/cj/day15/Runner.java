package com.careerit.cj.day15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Runner {

	public static void main(String[] args) throws IOException {

		List<String> lines = Files.readAllLines(Paths.get("emp.txt"));

		Employee[] empArr = new Employee[lines.size()];

		int i = 0;
		for (String line : lines) {
			String[] arr = line.split(",");
			int empno = Integer.parseInt(arr[0]);
			String ename = arr[1];
			double salary = Double.parseDouble(arr[2]);
			Employee emp = new Employee(empno, ename, salary);
			empArr[i++] = emp;
		}

		for (Employee emp : empArr) {
			emp.viewDetails();
			System.out.println("--------------------------");
		}

		// Total salary

		double tsalary = 0;

		for (Employee emp : empArr) {
			tsalary += emp.getSalary();
		}
		System.out.println("Total salary paid to the employees is :" + tsalary);

		// Earning max amount

		double maxSalary = empArr[0].getSalary();

		for (Employee emp : empArr) {
			if (maxSalary < emp.getSalary()) {
				maxSalary = emp.getSalary();
			}
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Max salary is :" + maxSalary);
		System.out.println("Max salary paid employees :");
		for (Employee emp : empArr) {
			if (maxSalary == emp.getSalary()) {
				emp.viewDetails();
			}
		}
		System.out.println("-----------------------------------------------");

		// People earning more 5000

		System.out.println("People who are earning more > 5000 ");

		for (Employee emp : empArr) {
			if(emp.getSalary() > 5000) {
				emp.viewDetails();
			}
		}
		
		// Who are getting min salary
		
		// Get employee whose name starts with letter 'S'
		
		// View all the employees in desc by salary
		
		// Get employee who is earning salary > 6000 and < 8000
		
		
	}
}
