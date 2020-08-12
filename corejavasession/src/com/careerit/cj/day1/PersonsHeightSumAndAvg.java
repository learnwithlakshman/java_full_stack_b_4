package com.careerit.cj.day1;

import java.util.Scanner;

public class PersonsHeightSumAndAvg {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the person1 height:");
		float p1_height = sc.nextFloat();
		System.out.println("Enter the person2 height:");
		float p2_height = sc.nextFloat();
		System.out.println("Enter the person3 height:");
		float p3_height = sc.nextFloat();

		float sum_heights = p1_height + p2_height + p3_height;
		float avg_heights = sum_heights / 3;

		System.out.println("The sum of heights is:" + sum_heights);
		System.out.println("Average height is :" + avg_heights);
		sc.close();

	}
}
