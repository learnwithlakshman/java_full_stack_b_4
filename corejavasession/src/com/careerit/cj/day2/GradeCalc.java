package com.careerit.cj.day2;

import java.util.Scanner;

public class GradeCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the score:");
		int score = sc.nextInt();

		String grade;

		if (score > 80 && score <= 100) {
			grade = "A+";
		} else if (score > 60 && score <= 80) {
			grade = "A";
		} else if (score > 50 && score <= 60) {
			grade = "B";
		} else if (score > 40 && score <= 50) {
			grade = "C";
		} else {
			grade = "D";
		}

		System.out.println("For score :" + score + " grade is :" + grade);
		sc.close();
	}
}
