package com.careerit.cj.day21;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

		

		public static void main(String[] args) {
			Map<Integer, String> map = new HashMap<Integer, String>();
			
			map.put(1001, "Krish");
			map.put(1002, "Charan");
			map.put(1003, "Manoj");
			map.put(1004, "Ramesh");
			map.put(1001, "Ramana");
			
				
			Set<Integer> keySet = map.keySet();
			for(Integer key:keySet) {
				System.out.println(key+" "+map.get(key));
			}
			Collection<String> values = map.values();
			
			System.out.println(keySet);
			System.out.println(values);
			
			map.entrySet().forEach(e->{
				System.out.println(e.getKey()+" "+e.getValue());
			});
			
			System.out.println(map.getOrDefault(1020, "Not present"));
			
			
			int num = 1010;
			String name = "Sai";
			
			map.putIfAbsent(num, name);
			System.out.println(map);
			
		}
}
