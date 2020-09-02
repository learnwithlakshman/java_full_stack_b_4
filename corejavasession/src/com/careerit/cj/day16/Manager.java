package com.careerit.cj.day16;

public class Manager {

		public static void main(String[] args) {
			
				Employee emp_1 = new Employee("Krish", "B.Tech");
				emp_1.showDetails();
				
				Employee emp_2 = new Employee("Manoj", "M.Tech",85000);
				emp_2.showDetails();
				
				
				Employee emp_3 = new Employee(1010,"Manoj", "M.Tech",85000);
				emp_3.showDetails();
				
				
		}
}
