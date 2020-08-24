package com.careerit.cj.day10;

public class StringExample {

	public static void main(String[] args) {

		String str1 = "Core Java";
		String str2 = "Core Java";
	
		
		String str3 = new String("Core Java");
		String str4 = new String("Core Java");
	
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		System.out.println(str1 == str3);
	
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
	
	}
}
