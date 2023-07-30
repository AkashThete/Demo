package com.demo.first;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class A {

	public static void main(String[] args) {
		Map<String,Integer> map =new HashMap();
		map.put("Akash",101 );
		map.put("Tejas",102 );
		map.put("bharat",103 );
		map.put("tanmay",104 );
		map.put("krish",1015 );
		map.put("ram",10166);
		Set<String>set=map.keySet();
		for(String s:set) {
			System.out.println("Key="+s);
			System.out.println("Value="+map.get(s));
		}
		
	

	}

}
