package com.HashSet_Set;

import java.lang.reflect.Array;
import java.util.*;
import java.util.HashSet;

public class HashSet_ReplHw {

	public static void main(String[] args) {
		
		Set<String> colors = new HashSet<>();
		colors.add("Red");
		colors.add("Pink");
		colors.add("Yellow");
		colors.add("White");
		colors.add("Black");
		
		System.out.println("Original Hash Set: "+colors+",");
		
//		Iterator<String> colorPrint = colors.iterator();
//		while(colorPrint.hasNext()) {
//			String prt = colorPrint.next();
//			System.out.println(prt);
//		}
		System.out.println("Size of the Hash Set: "+colors.size());
		
// #2		
		Set<Integer> numbers = new HashSet<>();
		numbers.add(111);
		numbers.add(111);
		numbers.add(111);
		numbers.add(999);
		numbers.add(999);
		numbers.add(999);
		
		System.out.println(numbers);
/* Will Print:	
 * 	[999, 111]
 * because hashSet does not allow duplicates
 */
		
// #3
	Set<String> sequence = new HashSet<>();
	sequence.add("first");
	sequence.add("Second");
	sequence.add("third");
	System.out.println(sequence);
	
	sequence.clear();
	System.out.println(sequence);

// #4
	Set<String> continents = new TreeSet<>();
	continents.add("India");
	continents.add("Australia");
	continents.add("South Africa");
	continents.add("India");
	continents.add("America");
	continents.add("America");
	
	System.out.println(continents);
	// WILL PRINT:
	// [America, Australia, India, South Africa]
	// - Does NOT allow duplicates

// #5
	Set<String> teach = new HashSet<>();
	String nValue = null;
	teach.add(nValue);
	teach.add("shiva");
	teach.add("sandish");
	teach.add("asel");
	teach.add("sumair");
	System.out.println(teach);
	boolean does = teach.contains(null);
	System.out.println(does);
	
// #6	
	Set<String> valManipulation = new HashSet<>();
	valManipulation.add("first");
	valManipulation.add("second");
	valManipulation.add("third");
	valManipulation.add("fourth");
	valManipulation.add("fifth");
	System.out.println(valManipulation);
	valManipulation.remove("second");
	System.out.println(valManipulation);
	valManipulation.clear();
	System.out.println(valManipulation);
	
// #7
	Set<String> printVal = new HashSet<>();
	printVal.add("first");
	printVal.add("second");
	printVal.add("third");
	printVal.add("fourth");
	printVal.add("fifth");
	
	Iterator<String> printing = printVal.iterator();
	while(printing.hasNext()) {
		System.out.println(printing.next());
	}
	
// #7
	System.out.println();
	Set<String> intoArray = new HashSet<>();
	intoArray.add("first");
	intoArray.add("second");
	intoArray.add("third");
	intoArray.add("fourth");
	intoArray.add("fifth");
	
	System.out.println("Array elements: ");
	Object[] allNum = intoArray.toArray();
	for(String getS: intoArray) {
		String one = getS;
		System.out.println(one);
	}
	
		
	}
}
