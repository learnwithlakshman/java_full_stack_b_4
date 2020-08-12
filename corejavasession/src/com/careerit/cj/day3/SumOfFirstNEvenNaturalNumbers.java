package com.careerit.cj.day3;

import java.util.Scanner;

public class SumOfFirstNEvenNaturalNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value:");

		int N = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= N; i = i + 2) {
			System.out.print(i+" ");
			sum += i;
		}

		System.out.println("The sum of even number is:" + sum);
		sc.close();

	}
}
