package com.careerit.cj.day4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MultiplicationOfTables {

	public static void main(String[] args) {

//		int lb = 1;
//		int ub = 20;
//
//		for (int num = lb; num <= ub; num++) {
//
//			for (int i = 1; i <= 10; i++) {
//				System.out.println(num + " * " + i + " = " + (num * i));
//			}
//			System.out.println("---------------------");
//		}

		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1

//		int n = 5;
//
//		for (int i = n; i >= 1; i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}

//		int lb = 1, ub = 100;
//
//		for (int l = lb; l <= ub; l++) {
//			int num = l;
//
//			boolean isPrime = true;
//
//			if (num < 2) {
//				isPrime = false;
//			} else {
//				for (int i = 2; i <= num / 2; i++) {
//					if (num % i == 0) {
//						isPrime = false;
//						break;
//					}
//				}
//			}
//
//			if (isPrime) {
//				System.out.print(num +" ");
//			}
//
//		}

//		int noofrooms = 30;
//		int studedents = 800;
//		int capacity = 30;
//
//		int count = 1;
//
//		if (studedents <= noofrooms * capacity) {
//			for (int i = 1; i <= noofrooms; i++) {
//				int s_for_room = 0;
//				if (count == studedents) {
//					break;
//				}
//				System.out.println("Arranging students for room :" + i);
//				
//				for (int j = 1; j <= capacity; j++) {
//					System.out.println("Student :" + count);
//					if (count == studedents) {
//						break;
//					}
//					count++;
//					s_for_room ++;
//				}
//				System.out.println("Room number :"+i+" has "+s_for_room);
//				System.out.println("-----------------------------------------------");
//
//			}
//
//		} else {
//			System.out.println("Wrong inputs student count is more than capacity.....");
//		}

//		int n = 1000;
//		int count = 0;
//		for (int k = 1;; k++) {
//
//			int num = k;
//			boolean isPrime = true;
//
//			if (num < 2) {
//				isPrime = false;
//			} else {
//				for (int i = 2; i <= num / 2; i++) {
//					if (num % i == 0) {
//						isPrime = false;
//						break;
//					}
//				}
//			}
//
//			if (isPrime) {
//				count++;
//				System.out.println(num);
//			}
//			if (count == n) {
//				break;
//			}

//		}

		// 1 2 3 4
		// 5 6 7 8
		// 9 10 11 12
		// 13 14 15 16

//		int c = 1;
//		for(int i=1;i<=4;i++) {
//			 
//			 for(int j=1;j<=4;j++) {
//				 System.out.print(c++ +" ");
//			 }
//			 System.out.println();
//		}

		// *
		// * *
		// * * *

//		int n=10;
//		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
//		
//		for(int i=n;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}

		// GCD two numbers

		int num1 = 35, num2 = 42;

		for (; num1 != num2;) {
			if (num1 > num2) {
				num1 = num1 - num2;
			} else {
				num2 = num2 - num1;
			}
		}

		int small = num1 < num2 ? num1 : num2;

//		int res=0;
//		for(int i=1;i<=small;i++) {
//			if(num1 % i == 0 && num2 % i == 0) {
//				res = i;
//			}
//		}
//		System.out.println(res);
//		
		

	}



	
}
