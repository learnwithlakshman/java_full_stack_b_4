package com.careerit.cj.day21;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

		public static void main(String[] args) {
			String names = "Krish,Manoj,Rajesh,Ramesh,Suresh,Jayesh,Krish,Manoj,Ramesh,Charan,Jayes,Krish,Rajesh,Suresh,Charan,Lakshman,Venkatesh,Lakshman,Kiran";
			String[] arr = names.split(",");
			
			Map<String,Integer> map = new HashMap<>();
			
			for(String name:arr) {
				
				map.putIfAbsent(name, 0);
				map.put(name, map.get(name)+1);
				
				
			}
			System.out.println(map);
			
		}
}
