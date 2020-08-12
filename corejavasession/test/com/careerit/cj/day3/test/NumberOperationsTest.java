package com.careerit.cj.day3.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.careerit.cj.day3.NumberOperations;



public class NumberOperationsTest {

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
