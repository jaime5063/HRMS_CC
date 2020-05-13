package com.class36;

import java.util.*;
import java.util.Map.Entry;

public class CityArray_Task {

	public static void main(String[] args) {
/*Create a Map from array of cities that will sort keys in alphabetical order.
 *  As a key store the name of the city and as a value store the length of the city 
 *  (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
 * 		
 */		
	Map<Integer, String> mapCity = new TreeMap<>();	
	mapCity.put(1, "Washington");
	mapCity.put(2, "Los Angeles");
	mapCity.put(3, "New York");
	mapCity.put(4, "Dallas");
	mapCity.put(5, "Las Vegas");
	
	Set<Entry<Integer, String>> cEntry = mapCity.entrySet();
	
	Iterator<Entry<Integer, String>> cI = cEntry.iterator();
	while(cI.hasNext()) {
		Entry<Integer, String> entry = cI.next();
		Integer num = entry.getKey();
		String city = entry.getValue();
		
		if(city.length() > 7) {
			cI.remove();
			
			System.out.println(city+" "+num);
		}
	}
	
	
		
	}

}
