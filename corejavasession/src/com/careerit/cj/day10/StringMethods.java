package com.careerit.cj.day10;

import java.util.Arrays;

public class StringMethods {

		public static void main(String[] args) {
			
			String s1 = "Core";
			String s2 = " Java";
			String s3 = "Core Java";
			String s4 = s1 + s2;  
			String s5 = new String("Core Java");  
			
			System.out.println(s4 == s3);
			System.out.println(s3.equals(s4));
			System.out.println(s4 == s5);
			
			
			String data = "ManiDeep M,Rajesh T,Manoj PVN,Naresh M,Suresh T,Jayesh B,Ramesh B"; 
			
			String[] arr = data.split(",");
			
			for(String name:arr) {
				String[] nameArr = name.split(" "); 
				String properName = nameArr[1]+" "+nameArr[0];
				System.out.println(properName);
	    	}
			
			String invoceData = "1001-Dell XPS-35000|1002-Dell Studio-35000|1003-Mac Airbook-55000|1004-Lenovo-55000";
			
			String[] productArr = invoceData.split("\\|");
			System.out.println(Arrays.toString(productArr));
			
			float sum = 0;
			for(String productData:productArr) {
				String[] parr = productData.split("-");
				float price = Float.parseFloat(parr[2]);	
				sum += price;
			}
			
			float avg = sum / productArr.length;
			System.out.println("The sum is :"+sum);
			System.out.println("Average price is :"+avg);
			
			
			String name = "hello";
			String sub = name.substring(3,3);
			System.out.println(sub);
			
			String message = "Hi Rajesh how are you?";
			
			String s_name = message.substring(2,10);
			System.out.println(s_name.trim());
			System.out.println(s_name);
			System.out.println(s_name.length());
			
			
			String s_data = "ABCDEF";      
			
			for(int i=0;i<s_data.length();i++) {
				System.out.println(s_data.substring(0,i+1));
			}
			
			
			String str_1 = "ABCDEFG";  
			int n = 3;
			
			// ABC, BCD, CDE, DEF, DFG
			System.out.println("-----------------------");
			
			for(int i=0; i < str_1.length()-n+1;i++) {
				String s = str_1.substring(i,i+n);
				System.out.println(s);
			}
			
			
			System.out.println("manoj".toUpperCase());
			System.out.println("MANOJ".toLowerCase());
			System.out.println("  Manoj Kumar ".trim());
			
			String str_2 = "MANOJ";
			for(int i=0;i<str_2.length();i++) {
				System.out.println(str_2.charAt(i));
			}
			
			
			String message_data = "hello how are you";
			
			// Vowel => 0 Consonants = 1
			
			message = "Hi Rajesh how are you?";
			
			String res = message.substring(2,10).trim().substring(0,3).toUpperCase().replace("A", "@").toLowerCase();
			
			System.out.println(res);	
			
			// StringBuffer and StringBuilder
			// Static and Final
			
		}
}
