package com.careerit.cj.day2;

import java.util.Scanner;

public class StudentResult {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the score:");
			int score = sc.nextInt();
			
			if(score>=40) {
				System.out.println("Result : PASS");
			}else {
				System.out.println("Result : FAIL");
			}
			sc.close();
			
		}
}
