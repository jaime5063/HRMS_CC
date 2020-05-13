package com.class34;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		
//		lets create a collection of vegetables where i don't want to have duplicates
//		Order of the elements is not preserved		
		
		HashSet<String> hset = new HashSet<>();
		// storing values
		hset.add("cucumber");
		hset.add("onion");
		hset.add("pepper");
		hset.add("zuccini");
		hset.add("carrot");
		hset.add("zuccini");
		
		// get the size of list
		System.out.println(hset.size());
		
		// HashSet stores elements randomly
		System.out.println(hset);
		
		//they do not have any methods to retrieve elements from the collection
		// example: .get();, .set();
		
		
		//How can re retrieve all elements?
		// 1. = Iterator		
		Iterator<String> it = hset.iterator();	
		while(it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}
	
		// 2. = enhanced for loop
		for(String el: hset) {
			System.out.println(el);
		}

	}

}
