package com.careerit.cj.day7;

public class ArraySearchExample {

	public static void main(String[] args) {
		int[] sArr = new int[] { 1, 3, 5, 7, 9, 11 };
		int[] subArr = new int[] { 1, 3, 10 };

		System.out.println(search(sArr, subArr));

	}

	public static boolean searchElement(int arr[], int ele) {

		for (int i = 0; i < arr.length; i++) {
			if (ele == arr[i]) {
				return true;
			}
		}

		return false;
	}

	public static boolean searchElements(int[] arr, int a, int b, int c) {
		return searchElement(arr, a) && searchElement(arr, b) && searchElement(arr, c);
	}

	public static void showElements(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// If element present it should return index else -1

	public static int search(int[] arr, int ele) {

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if (num == ele) {
				return i;
			}
		}
		return -1;
	}

	public static boolean search(int[] superArr, int[] subArr) {

		for (int i = 0; i < subArr.length; i++) {
			if (!searchElement(superArr, subArr[i]))
				return false;
		}

		return true;

	}

}
