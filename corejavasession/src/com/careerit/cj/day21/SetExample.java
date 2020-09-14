package com.careerit.cj.day21;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Employee{
	
		int empno;
		String name;
		double salary;
		public Employee(int empno, String name, double salary) {
			this.empno = empno;
			this.name = name;
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(empno, name);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return empno == other.empno && Objects.equals(name, other.name);
		}
		
		
		
	
}

public class SetExample {
	public static void main(String[] args) {
		
			Set<Integer> set = new HashSet<Integer>();
			set.add(1001);
			set.add(1002);
			set.add(1001);
			set.add(1002);
			set.add(1003);
			
			System.out.println(set);
			
			for(Integer num:set) {
				System.out.println(num);
			}
			System.out.println("-----------------------------");
			set.stream().forEach(System.out::println);

			Employee emp1 = new Employee(1001, "Krish", 45000);
			Employee emp2 = new Employee(1001, "Krish", 45000);
			Employee emp3 = new Employee(1001, "Krish", 45000);
			Employee emp4 = new Employee(1002, "Manoj", 55000);
			
			Set<Employee> empSet = new HashSet<>();
			
			empSet.add(emp1);
			empSet.add(emp2);
			empSet.add(emp3);
			empSet.add(emp4);
			
			System.out.println(empSet.size());
	}
}
