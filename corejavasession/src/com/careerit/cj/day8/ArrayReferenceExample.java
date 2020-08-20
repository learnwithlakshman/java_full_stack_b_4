package com.careerit.cj.day8;

import java.util.Arrays;

public class ArrayReferenceExample {

	public static void main(String[] args) {

		int[] empArr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] d = new int[] { 4, 5, 6, 7 };
		int[] q = new int[] { 1, 2 };

		int[] s = new int[empArr.length-d.length - q.length];

		int i = 0;

		for (int ele : empArr) {
			if (!(isFound(d, ele) || isFound(q, ele))) {
				s[i++] = ele;
			}
		}
	
		System.out.println(Arrays.toString(s));
	}

	public static boolean isFound(int[] arr, int ele) {
		for (int value : arr) {
			if (ele == value)
				return true;
		}

		return false;
	}
	
	

}
