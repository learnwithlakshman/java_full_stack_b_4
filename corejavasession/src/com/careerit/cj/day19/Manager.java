package com.careerit.cj.day19;

interface ArrayOperations {
	long sum(int[] arr);

	default long max(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}
	
	default String hello() {
		return "Hello Java";
	}

	default int primeCount(int[] arr) {
		int count = 0;
		for (int ele : arr) {
			if (isPrime(ele))
				count++;
		}
		return count;
	}

	private  boolean isPrime(int num) {
		return true;
	}

	public static int diagonalSum(int[][] arr) {
		return 0;
	}

}

class A implements ArrayOperations {
	@Override
	public long sum(int[] arr) {
		int res = 0;
		for (int ele : arr)
			res += ele;

		return res;
	}
	
	@Override
	public String hello() {
		
		return "HELLO JAVA WORLD";
	}

}

public class Manager {

	public static void main(String[] args) {
		ArrayOperations obj = new A();
	
		System.out.println(obj.max(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
		System.out.println(obj.sum(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
		
		System.out.println(obj.hello());
	}

}
