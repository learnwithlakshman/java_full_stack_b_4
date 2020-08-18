package com.careerit.cj.day7;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		int[] arr = new int[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the [" + (i + 1) + "] value:");
			int num = sc.nextInt();
			arr[i] = num;
		}

		// Display array elements

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// Sum of elements:

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("\nArray elements sum: " + sum);

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

		// Find Biggest element

		int biggest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if(biggest < arr[i]) {
				biggest = arr[i];
			}
		}
		System.out.println("\nBiggest value:"+biggest);
		
		// Find Smallest element
		
		int smallest = arr[0];
		
		for(int i=1;i<=arr.length;i++) {
			if(smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		System.out.println("Smallest is :"+ smallest);
		sc.close();

	}
}
