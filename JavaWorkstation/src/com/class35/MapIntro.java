package com.class35;

import java.util.*;

public class MapIntro {

	public static void main(String[] args) {


// HashMap
		HashMap<Integer, String> map=new HashMap<>();
		//to store key+value pair into map
		map.put(101, "John");
		map.put(102, "Jack");
		map.put(103, "Jane");
		map.put(104, "Jenny");
		
		System.out.println(map);
		//how to verify if there any elements inside map
		boolean flag = map.isEmpty(); // check if not empty
		if(!flag) {					  // if not empty go inside code
			int size = map.size();
			System.out.println(size);
		}
		
		//I want to add more entries
//		map.put("Test", "String"); --> CE: keys & value must be matched
		
		//adding duplicate values = can have duplicate Value
		map.put(105, "John");
		System.out.println(map);
		//adding duplicate keys = Override, cannot duplicate keys
		map.put(102, "Hasan");
		System.out.println(map);
	
		//how to access a value
		String mapElement = map.get(105); // Value of Key 105
		System.out.println(mapElement);
		
		//Replace or update the value
		map.replace(103, "Zeynep");
		System.out.println(map);
		
		//Remove entry object from the map
		map.remove(101);
		System.out.println(map);
		
		//how to verify if certain key exists/exists
//		- containsKey
//		- containsValue
		map.containsKey(103);
//		or
		boolean flag1 = map.containsKey(103);
		if(flag1) {
			map.replace(103, "Seval");
		}else {
			map.put(103, "Seval");
		}
		System.out.println(flag1);
		
		//how to verify value exists in map
		map.containsValue("Seval");
//		or
		boolean contains = map.containsValue("Seval");
		System.out.println(contains);
		System.out.println(map);
		
		
		
		

	}

}
