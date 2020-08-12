package com.careerit.cj.day3;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int num = sc.nextInt();

		int res = 1;

		for (int i = 2; i <= num; i++) {
			res = res * i;
		}

		System.out.println("Factorial of " + num + " is " + res);

		sc.close();

	}
}
