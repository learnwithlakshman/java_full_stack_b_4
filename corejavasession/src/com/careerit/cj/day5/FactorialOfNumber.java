package com.careerit.cj.day5;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number to find factorial:");
//		int num = sc.nextInt();
//		int res = 1;
//		for (int i = num; i >= 2; i--) {
//			res = res * i;
//		}
//		int i = num;
//		while (i >= 2) {
//			res = res * i;
//			i--;
//		}
//		System.out.println("Factorial of " + num + " is " + res);
//		sc.close();

		// GCD two number

		System.out.println(gcd(45, 60)); // 15
		System.out.println(gcd(7, 5)); // 1
		System.out.println(gcd(19, 22)); // 1
		System.out.println(gcd(45, 75)); // 15
		System.out.println(gcd(1, 1)); // 1

		System.out.println(sumOfDigits(18981));
		System.out.println(sumOfDigits(888));

		int num = 12321;

		int rev = reverse(num);

		if (rev == num) {
			System.out.println(num + " is a palindrome");
		} else {
			System.out.println(num + "is not a palindrome");
		}

		System.out.println(singleDigitSum(729));

	}

	public static int singleDigitSum(int num) {

		while (num > 9) {
			num = num % 10 + num / 10;
		}

		return num;
	}

	public static int reverse(int num) {
		int rev = 0;
		while (num != 0) {
			int r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}
		return rev;
	}

	public static int sumOfDigits(int num) {

		int sum = 0;
		while (num > 9) {
			sum = 0;
			while (num != 0) {
				int r = num % 10;
				sum = sum + r;
				num = num / 10;
			}
			num = sum;
		}
		return sum;

	}

	private static int gcd(int num1, int num2) {

		while (num1 != num2) {
			if (num1 > num2) {
				num1 = num1 - num2;
			} else {
				num2 = num2 - num1;
			}
		}
		return num1;
	}

}
