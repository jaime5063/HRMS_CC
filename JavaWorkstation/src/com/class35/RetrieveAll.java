package com.class35;

import java.util.*;

public class RetrieveAll {
	
	public static void main(String[] args) {


/* Create map of a person
	name, lastName, address, city, state
*/	
	
	Map<String, String> personMap = new LinkedHashMap<>();
	personMap.put("name", "Ahmet");
	personMap.put("lastName", "Yildiz");
	personMap.put("Address", "123 test");
	personMap.put("City", "Dallas");
	personMap.put("State", "Texas");
	
	System.out.println(personMap);
	
	// How to retrieve a specific value?
	String value = personMap.get("State");
	System.out.println(value);
	
// How can I retrieve all key and all Values?
	
	// PRINTING KEYS:
//	Method: keySet();
	Set<String> keys = personMap.keySet();
	for(String loopKey: keys) {
		System.out.println(loopKey);
	}
	
	Iterator<String> keyIterator = keys.iterator();
	while(keyIterator.hasNext()) {
		System.out.println(keyIterator.next());
	}
	
	// PRINTING VALUES:
//	Method: values();
	Collection<String> values = personMap.values();
	for(String val: values) {
		System.out.println(val);
	}
	
	Iterator<String> valuesIterator = values.iterator();
	while(valuesIterator.hasNext()) {
		System.out.println(valuesIterator.next());
	}
	
	
// How can I retrieve and print values key:value?
	for(String loopKey: keys) {
		System.out.println(loopKey+": "+personMap.get(loopKey));
	}
	// using Iterator
	Iterator<String> keyIterator2 = keys.iterator();
	while(keyIterator2.hasNext()) {
		String mapKey = keyIterator2.next();
		String mapValue = personMap.get(mapKey);
		System.out.println(mapKey+"_"+mapValue);
	}
	
	}
}
