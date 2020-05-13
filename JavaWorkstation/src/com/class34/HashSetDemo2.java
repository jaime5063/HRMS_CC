package com.class34;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {
				
		// create a collection that will store Sweets type of object
		// and I do not want duplicates
		// I don't care about the order 
		// as long as i don't have duplicate object
		// = HashSet
		
		Set<Sweets> sweetSet = new HashSet<>();
		// add 2 steps
		Sweets sweet = new Sweets("Cake");
		sweetSet.add(sweet);
		// add directly
		sweetSet.add(new Sweets("Cookies"));
		sweetSet.add(new Sweets("Ice Cream"));
		sweetSet.add(new Sweets("Cookies"));
		sweetSet.add(new Sweets("Cookies"));
		sweetSet.add(new Sweets("Cookies"));
		sweetSet.add(sweet);
		
		// how do we print name of each sweet?
		Iterator<Sweets> element = sweetSet.iterator();
		while(element.hasNext()) {
			System.out.println(element.next().name);
		}
		
		
/* No duplicate and no order-->HashSet
 * 
 * No duplicate and ascending order-->TreeSet
 * 
 * No duplicate and insertion order --> LinkedHashSet
 * 		
 */
	}

}
