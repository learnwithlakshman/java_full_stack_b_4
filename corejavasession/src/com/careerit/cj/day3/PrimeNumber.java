package com.careerit.cj.day3;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value:");
		int N = sc.nextInt();

		if (N > 1) {
			boolean isprime = true; 
			for (int i = 2; i <= N / 2; i++) {

				if (N % i == 0) {
					isprime = false;
					break;
				}
			}

			if (isprime) {
				System.out.println(N + " is prime");
			} else {
				System.out.println(N + " is not prime");
			}
		}else {
			System.out.println("Please enter the number > 1 only");
		}
		sc.close();
	}
}
