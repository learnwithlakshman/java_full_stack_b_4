package com.careerit.cj.day3;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value:");

		int N = sc.nextInt();
		
		int res = 0;
		for (int i = 1; i <= N; i++) {
			res = res + i;
		}
		
		
		System.out.println("The sum of first "+N+" natural number is :"+res);
		sc.close();

	}
}
