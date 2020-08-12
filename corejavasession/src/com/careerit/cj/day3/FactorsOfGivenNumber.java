package com.careerit.cj.day3;

import java.util.Scanner;

public class FactorsOfGivenNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value:");
		int N = sc.nextInt();
		
		if (N == 1) {
	    	System.out.print(1 + " ");
		}

		if (N > 1) {
			System.out.print(1 + " ");
			for (int i = 2; i <= N/2; i++) {
				if (N % i == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.print(N);
		}
		
		if(N <= 0) {
			System.out.println("Please enter valid +ve number");
		}
		sc.close();

	}

}
