package com.careerit.cj.day20;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

		public static void main(String[] args) {
			
			List<String> namesList = new ArrayList<String>();
			
			namesList.add("Krish");
			namesList.add("Manoj");
			namesList.add("Charan");
			namesList.add("Rajesh");
			
			System.out.println(namesList.size());
			System.out.println(namesList.get(0));
			
			for(int i=0;i<namesList.size();i++) {
				String name = namesList.get(i);
				System.out.println(name);
			}
			
			System.out.println("*".repeat(30));
			for(String name:namesList) {
				System.out.println(name);
			}
			
			System.out.println("*".repeat(30));
			namesList.stream().forEach(e->System.out.println(e));
			
			namesList.set(1, "Manoj Kumar");
			System.out.println(namesList);
			
			namesList.remove(1);
			System.out.println(namesList);
			
			System.out.println(namesList.contains("Rajesh"));
			
		}
}
