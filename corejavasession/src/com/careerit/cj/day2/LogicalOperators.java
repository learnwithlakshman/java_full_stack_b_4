package com.careerit.cj.day2;

public class LogicalOperators {

		public static void main(String[] args) {
			boolean a = true;
			boolean b = false;
			boolean c = true;
			
			System.out.println(a && b);   //false
			
			System.out.println(a && c);   //true
			System.out.println(a || c);   //true
			System.out.println(a || b);   //true
			System.out.println(a && b && c); // false
			System.out.println(a || b || c); // true
			System.out.println(!a);   // false
			System.out.println(!b);  // true
			
			int num = 10;
			++num;
			System.out.println(num);
			
			
		}
}
