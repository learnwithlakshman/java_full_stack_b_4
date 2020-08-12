package com.careerit.cj.day2;

import java.util.Scanner;

public class NumberConvertion {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the age:");
			int age = sc.nextInt();
			// Logic -ve number covert into +ve number
			if(age < 0) {
				age = -age;
			}
			
			System.out.println("Entered age is :"+age);
			sc.close();
		}
}
