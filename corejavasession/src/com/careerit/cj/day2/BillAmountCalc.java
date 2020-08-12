package com.careerit.cj.day2;

import java.util.Scanner;

public class BillAmountCalc {

		public static void main(String[] args) {
			float discount = 0.0f;
			float net_amount = 0.0f;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the bill amount:");
			float bill_amount = sc.nextFloat();
			
			if(bill_amount >= 10000) {
				discount = bill_amount * .2f;
			}
			
			net_amount = bill_amount - discount;
			System.out.println("Hi, Here is the bill details");
			System.out.println("Bill amount :"+bill_amount);
			System.out.println("Discount :"+discount);
			System.out.println("Net amount:"+net_amount);
			
			sc.close();
			
			
		}
}
