package com.careerit.cj.day8;

import java.util.Arrays;

public class MatrixOperations {

	public static void main(String[] args) {
		int[][] arr = new int[][] {

				{ 1, 2, 3 },
				{ 4, 5, 1 }, 
				{ 7, 8, 9 } 
				
		};
		
		System.out.println(Arrays.toString(arr));

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}

		int diagonalSum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					diagonalSum += arr[i][j];
				}
			}
		}

		int maxSumOfRow = 0;

		for (int i = 0; i < arr.length; i++) {
			int rsum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				rsum += arr[i][j];
			}
			if (maxSumOfRow < rsum) {
				maxSumOfRow = rsum;
			}
		}
	
		int maxColSum = 0;
		for (int i = 0; i < arr.length; i++) {
			int csum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				csum += arr[j][i];
			}
			if(maxColSum < csum) {
				maxColSum = csum;
			}

		}

		System.out.println(sum);
		System.out.println(diagonalSum);
		System.out.println(maxSumOfRow);
		System.out.println(maxColSum);
	}
}
