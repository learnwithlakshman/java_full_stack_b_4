package com.careerit.cj.day3;

public class NumberOperations {

	public boolean isPrime(int num) {
		
		if(num <= 1) {
			return false;
		}
		boolean isprime = true;
		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {
				isprime = false;
				break;
			}
		}
		return isprime;

	}
}
