package com.careerit.cj.day13;

import java.util.Arrays;

final class MyMath {
	// Other
	private MyMath() {

	}

	public static int sub(int a, int b) {
		return a > b ? a - b : b - a;
	}

	public static int add(int a, int b) {
		return a + b;
	}
}

class NumberOperations {

	public void cal(int a, int b, String ope) {
		
		if (ope.equals("-")) {
			int res = MyMath.sub(a, b);
			System.out.println(res);
		} else if (ope.equals("+")) {
			int res = MyMath.add(a, b);
			System.out.println(res);
		}
	}
}

public class FinalkeywordExample {

	static final int DAYS_IN_WEEK = 7;

	public final static void main(final String[] args) {
		
		final int x = 100;
		
		NumberOperations obj = new NumberOperations();
		obj.cal(10, 15, "-");

		System.out.println("--------------------------------");

		int[] numArr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(numArr));
		increment(numArr);
		process(numArr);
		System.out.println(Arrays.toString(numArr));

		int a = 10;
		int b = 20;

		System.out.println("Before swap : a = " + a + " and b = " + b);
		swap(a, b);
		System.out.println("After swap : a = " + a + " and b = " + b);

	}

	public static void process(final int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + 1;
		}
	}

	public static void swap(int a, int b) {
		int t = a;
		a = b;
		b = t;
	}

	public static void increment(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + 1;
		}
	}
}
