package com.careerit.cj.day11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		StringBuilder names = new StringBuilder("Hello");
		Scanner sc = new Scanner(new File("names.txt"));
		long stime = System.currentTimeMillis();
		while (sc.hasNextLine()) {
			String name = sc.nextLine();
			names.append(name).append(",");
		}
		System.out.println(names);
		names.substring(0, names.length() - 1).toString();

		long etime = System.currentTimeMillis();
		System.out.println(etime - stime);

		StringBuilder sb1 = new StringBuilder("hello");
		StringBuilder sb2 = new StringBuilder("hello");

		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));

		String name = "123454329";
//		boolean isPalindrome = true;
//		for (int i = 0, j = name.length() - 1; i <= j; i++, j--) {
//				if(name.charAt(i) != name.charAt(j)) {
//					isPalindrome = false;
//					break;
//				}
//		}
//		if(isPalindrome) {
//			System.out.println(name+" is palindrome");
//		}else {
//			System.out.println(name +" is not a palindrome");
//		}
		
		
		String cname = "Tanvi";
		String account = "*************3213";
		double balance = 102500;
		
		//Withdraw
		
		double wamount = 2500;
		
//		String logdata = "Customer name : ".concat(cname).concat(" Account number: ").concat(account)
//				.concat(" Balance :"+balance);
//		
		StringBuilder sb = new StringBuilder();
		sb.append("Customer name :").append(cname).append(" Account Number : ").append(account).append(" Balance :").append(balance);
		System.out.println(sb);
	
		
		StringBuilder html = new StringBuilder("<html>");
		html.append("<head><title>Response from Server</title></head>");
		html.append("<body>");
		html.append("<h3>You made request for item XYX</h3>");
		html.append("</body>");
		html.append("</html>");
		
		String s = html.toString();
		System.out.println(s);
		
	
		
		
     	if(new StringBuilder(name).reverse().toString().equals(name)) {
			System.out.println(name+" is palindrome");
		}else {
			System.out.println(name +" is not a palindrome");
		}
	}
}
