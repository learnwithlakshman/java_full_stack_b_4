package com.careerit.cj.day12;

public final class StringInterviewQuestions {
	
	private StringInterviewQuestions() {
		
	}

	public static int planindromeCount(String[] arr) {
		int count = 0;
		for (String name : arr) {
			if (new StringBuilder(name).reverse().toString().equals(name)) {
				count++;
			}
		}
		return count;
	}

	public static int getMatchedSubString(String str, int len, String key) {
		int count = 0;

		if (len != key.length())
			return count;

		for (int i = 0; i < str.length() - len + 1; i++) {
			String substr = str.substring(i, i + len);
			if (substr.equals(key)) {
				count++;
			}
		}
		return count;
	}

	public static String replace(String str) {
		String rstr = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'A' || ch == 'I' || ch == 'O' || ch == 'E' || ch == 'U') {
				rstr += "1";
			} else {
				rstr += "0";
			}
		}
		return rstr;
	}

}
