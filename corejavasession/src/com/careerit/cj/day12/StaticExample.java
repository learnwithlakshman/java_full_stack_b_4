package com.careerit.cj.day12;

import static com.careerit.cj.day12.StringInterviewQuestions.planindromeCount;
import static com.careerit.cj.day12.StringInterviewQuestions.replace;
import static java.lang.Math.ceil;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.System.*;

public class StaticExample {
	
	
	static{
		System.out.println("Static block -1");		
	}
	
	static int num = 100;
	public static final void main(final String... args) {
		
		String[] strArr = new String[] { "123", "121", "12421", "12321", "liril", "mom", "dad", "brother" };
		int count = planindromeCount(strArr);
		out.println("Count of palindrome in given array is :" + count);
		out.println(replace("LAK"));

		out.println(sqrt(16));
		out.println(pow(2, 4));
		out.println(ceil(3.5));
		System.out.println("Main method...");
		Inner obj = new StaticExample.Inner();
		obj.greet();
		num++;
		System.out.println(num);
		
	}
	static {
		System.out.println("Static block -2");
	}
	
	static class Inner{
		public  void greet() {
				System.out.println("Hi, How are you?");
			}
	}

}
