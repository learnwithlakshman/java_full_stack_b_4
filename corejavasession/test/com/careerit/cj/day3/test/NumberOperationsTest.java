package com.careerit.cj.day3.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.careerit.cj.day3.NumberOperations;

public class NumberOperationsTest {

	@Test
	void subSetTest() {

		int a[] = { 1, 2, 3 }, b[] = { 2, 3, 6 };

		if(isSubSet(a, b)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

	private boolean isSubSet(int arr[], int[] subArr) {
		if (arr.length < subArr.length) {
			return false;
		}

		for (int i = 0; i < subArr.length; i++) {
			if (!search(arr, subArr[i])) {
				return false;
			}
		}

		return true;

	}

	private boolean search(int arr[], int key) {
		for (int ele : arr) {
			if (ele == key) {
				return true;
			}
		}
		return false;
	}

	@Test
	void isPrimeWithPrimeNumber() {
		NumberOperations obj = new NumberOperations();
		int num = 19;
		boolean res = obj.isPrime(num);
		Assertions.assertTrue(res);

	}

	@Test
	void isPrimeWithZero() {
		NumberOperations obj = new NumberOperations();
		int num = 0;
		boolean res = obj.isPrime(num);
		Assertions.assertEquals(false, res);
	}

	@Test
	void isPrimeWithTwo() {
		NumberOperations obj = new NumberOperations();
		int num = 19;
		boolean res = obj.isPrime(num);
		Assertions.assertEquals(true, res);
	}

	@Test
	void isPrimeWithOne() {
		NumberOperations obj = new NumberOperations();
		int num = 1;
		boolean res = obj.isPrime(num);
		Assertions.assertEquals(false, res);
	}

	@Test
	void isPrimeNveNumbers() {
		NumberOperations obj = new NumberOperations();
		int num = -10;
		boolean res = obj.isPrime(num);
		Assertions.assertEquals(false, res);
	}

}
