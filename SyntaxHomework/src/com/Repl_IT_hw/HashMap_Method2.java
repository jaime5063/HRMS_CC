package com.Repl_IT_hw;

import java.util.*;
import java.util.Map.Entry;

class HashMap_Method2{
	
	public void display(Map<String, Integer> mAp) {
		if(mAp.isEmpty()) {
			System.out.println("map is empty");
		}else {
			for(String keyz:mAp.keySet()) {
				System.out.println(keyz+" : "+mAp.get(keyz));
			}
		}
	}
	
	public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<>();
	map.put("apple", 30);
	map.put("mango", 10);
	map.put("Orange", 20);
	
	HashMap_Method2 mCall = new HashMap_Method2();
	mCall.display(map);
	
	map.clear();
	
	mCall.display(map);
	
	}
}
	/*Create a Method in Main class using below specification. 
	Method Name: Display. 
	Return Type: Void
	Parameters : Map<String,Integer>
	Logic: 
	First the method will check the given map is empty or not. 
	If the map is not empty pairs of key and value using loops
	If map is empty simply print "map is empty"
	
	NOW IN MAIN METHOD
	Create HashMap of String keys and Integer values
	add values as below
	map.put("mango", 10); 
	map.put("apple", 30); 
	map.put("orange", 20); 
	
	using created display method to display. 
	
	then clear the map. 
	
	use the same method to display
	 * 
	 */