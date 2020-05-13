package com.IQPrep;

import java.util.*;
import java.util.Arrays;

public class JavaIQ {

	public static void main(String[] args) {
		
	// swap 2 number without temporary variable -----
	int a1 = 8;
	int a2 = 10;
	
	a1=a1+a2;
	a2=a1 - a2;
	a1=a1 - a2;
	System.out.println(a1);
	System.out.println(a2);

	
	// Swap 2 Strings without temporary variable -----
	String s = "lakers";
	String s2 = "la";
	
	s = s + s2;
	s2 = s.substring(0,(s).length()-s2.length());
	s = s.substring(s2.length());
	System.out.println(s);
	System.out.println(s2);
	
	
	// Write a java program to find the second largest number in the array? -----	
	int[] numArray = {8, 24, 10, 23,};
	Arrays.sort(numArray);
	System.out.println(numArray[numArray.length-2]);
	
	
	// Max and Min number of an array -----
	int[] sArray = {8, 15, 33, 10};
	Arrays.sort(sArray);
	
	int min = sArray[0];
	int max = sArray[sArray.length-1];
	
	System.out.println("MIN = "+min+" Max = "+max);
	
	
	// Find out how many alpha characters are present in a string -----
	String basic = "sklajdoALOQIPSbodowdnSD2721S98309_D*&^$##EWFW%^^";
	
	String alpha = basic.replaceAll("[^!A-Za-z]", ".");
	System.out.println(alpha);
	
	
	// How to find out the part of the string from a string -----
	String part = "Welcome to Los Angeles";
	System.out.println(part.substring(9));
	
		// What is substring? (How many words are in a string -  returns Int)
		String[] words = part.split(" ");
		System.out.println(words.length);
		
		// Find	number of words in string (Give me each word of the string - returns String)
		for(String str : words) {
			System.out.println(str);
		}
		
	
	// Write a java program to reverse String -----
		
		//Using reverse function
		String rev = "Good Morning";
		StringBuffer r = new StringBuffer(rev);
		System.out.println(r.reverse());

		//Without using reverse function - charAt()
		String reverse = "My World";
		String reversed = "";
		
		for(int i=reverse.length()-1; i>=0; i--) {
			reversed=reversed+reverse.charAt(i);
		}
		System.out.println("Reversed string: "+reversed);
		
	
	// Write a Java Program to find whether a String is a palindrome or not -----		
		String an = "nana";
		String ra = "";
		for(int i=an.length()-1; i>=0; i--) {
			ra = ra + an.charAt(i);
		}
		System.out.println(ra);
		
		if(an.equals(ra)) {
			System.out.println("String is a Palindrome");
		}else {
			System.out.println("This is not a palindrome String");
		}
		
	
	// Write a java program to check whether a given number is prime or not -----
		int pr = 11;
		boolean isPrime = true;
		
		if(pr <=1) {
			isPrime = false;
		}else {
			for(int i=2; i<pr; i++) {
				if(pr % i == 0) {
					isPrime=true;
					break;
				}
			}
		}
		if(isPrime) {
			System.out.println(pr+" is a prime number");
		}else {
			System.out.println(pr+" is not a prime number");
		}
		
		
	// Write a Java Program to print the first 10 numbers of Fibonacci series -----
		int a = 0, b=1, c;
		
		for(int i=0; i<10; i++) {
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;	
		}

	
	// How can you remove all duplicates from ArrayList -----		
		ArrayList<String> rMove = new ArrayList<>();
		rMove.add("Naomi");
		rMove.add("Noah");
		rMove.add("Nathan");
		rMove.add("Naomi");
		rMove.add("Noah");
		
		// 1 way (Removing duplicated by adding arrayList into hashSet)
		HashSet<String> removing = new HashSet<>(rMove);
		System.out.println("Removing duplicates "+ removing);

	
	// Print values of an arrayList using loop 
		ArrayList<String> loop = new ArrayList<>();
		loop.add("one");
		loop.add("two");
		loop.add("three");
		
		for(int l=0; l<loop.size(); l++) {
			System.out.println("My For Loop: "+loop.get(l));
		}
		
	// Print values of an arrayList using advanced loop
		for(String adv: loop) {
			System.out.println("My Advanced loop: "+adv);
		}
		
	// Create linkedList and then add to it in specific index		
		LinkedList<String> index = new LinkedList<>();
		index.add("Index 0");
		index.add("Index 1");
		index.add("Index 2");
		
		index.add(2, "Real 2");
		for(String prnt: index) {
			System.out.println(prnt);
		}
		// removing specified index
		System.out.println("-- Removing index 3 --");
		index.remove("Index 2"); // can remove with integer or with a string
		for(String rmv : index) {
			System.out.println(rmv);
		}
		
		HashSet hset = new HashSet();
		hset.add("Hello");
		hset.add(1);
		hset.add(123);
		hset.add("Adios");
		for(Object all: hset) {
			System.out.println("Printing Hset Objects: "+all);
		}
		
		
		// Map of String and Integers 
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("Age", 33);
		myMap.put("Weight", 275);
		myMap.put("Heigh", 55);
		myMap.put("Foot Size", 8);
		// Using for loop
		for(Map.Entry<String, Integer> entry : myMap.entrySet()) {
			if(entry.getKey().contains("Foot Size")) {
				entry.setValue(9);
			}
			System.out.println(entry);
		}	
		myMap.replace("Age", 40);
		
		// Using advanced loop
		for(Map.Entry obj : myMap.entrySet()) {
			System.out.println("Advanced for loop "+obj.getKey()+" "+obj.getValue());
		}
		
		
		
	for(int i = 1; i<=5; i++) {
		for(int j = 1; j<=i; j++) {
			System.out.println(j+" ");
		}
		System.out.println();
	}

		
		
		
		
		
		
		
		
		
		
		
	}

}
