package com.demo.first;

import java.util.HashMap;
import java.util.Map;

public class B {
	public static void getCharCount(String name) {
		char arr[]=name.toCharArray();
		Map<Character,Integer>map=new HashMap();
		for(char c:arr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c));
			}else {
				map.put(c, 1);
			}
			
		}
		System.out.println(name+":"+map);
	}

	public static void main(String[] args) {
		getCharCount("good morning");
	
	}

}
