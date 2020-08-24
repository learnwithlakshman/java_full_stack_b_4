package com.careerit.cj.day11;

public class StringQuestions {

	public static void main(String[] args) {

		String data = "Hello,Manoj,Suresh";

		String name = data.split(",")[1].toUpperCase().substring(0, 3);

		String firstName = "Manoj";
		String middleName = "P";
		String lastName = "VN";

		String fullName = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
		System.out.println(fullName);
	}
}
