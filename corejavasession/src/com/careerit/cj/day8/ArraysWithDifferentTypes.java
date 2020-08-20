package com.careerit.cj.day8;

public class ArraysWithDifferentTypes {

		public static void main(String[] args) {
			
				boolean[] arr = new boolean[5];
				String[] names = new String[] {"Krish","Manoj","Jayesh","Rohit","Dhoni"};
				
				for(boolean ele:arr) {
					System.out.println(ele);
				}
				
				for(String name:names) {
					System.out.println(name);
				}
				
		}
}
