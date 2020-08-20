package com.careerit.cj.day8;

import java.util.Arrays;

public class ArrayLeftShift {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));
		arr = leftShift(arr, 3);
		System.out.println(Arrays.toString(arr));

	}

	// if N=3 arr= [1,2,3,4,5] = [2,3,4,5,1] => [3,4,5,1,2] => [4,5,1,2,3]

	public static int[] leftShift(int[] arr, int N) {

		for (int i = 1; i <= N; i++) {

			int ele = arr[0];

			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			
			arr[arr.length-1] = ele;
		}
		return arr;
	}
}
