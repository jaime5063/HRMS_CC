package com.HwCollection;

import java.util.*;

public class Countries {

	public static void main(String[] args) {
/* 1. Create a Set collection in which you need to add names of the countries. 
 * 	  In this set we want all objects to be sorted in alphabetical order.
 * 	  Using 2 different ways, retrieve all elements from set.
 */	
		Set<String> countries = new TreeSet<>();
		countries.add("USA");
		countries.add("Canada");
		countries.add("Mexico");
		countries.add("Italy");
		countries.add("France");
		
		Iterator<String> one = countries.iterator();
		while(one.hasNext()) {
			String el = one.next();
			System.out.println(el);
		}
		System.out.println("----Second way----");
		for(String element: countries) {
			System.out.println(element);
		}
		
/* 2. Create a set of cities in which you want to make sure that insertion order is maintained
 * 	  Using iterator remove any city that starts with "A".
 */		System.out.println("----------------------");
		Set<String> city = new LinkedHashSet<>();
		city.add("Los Angeles");
		city.add("Addison");
		city.add("Wahsington D.C.");
		city.add("Berlin");
		city.add("Paris");
		city.add("Alberta");
		city.add("New York");
		
		Iterator<String> cities = city.iterator();
		String out = "";
		while(cities.hasNext()) {
			out = (String) cities.next();
			if(out.startsWith("A")) {
				cities.remove();
			}else
				System.out.println(out);
		}
		System.out.println("--------------------");
		
/* 3. Create a set collection that will hold objects of Student Type;
 * 	  In this set we do not care about the insertion order.
 * 	  Each student object should have name and studentID. Display name of each student.
 */
		
		
		Set <CountriesAndStudents> students = new HashSet<>();
		students.add(new CountriesAndStudents("Micheal Jordan", 23));
		students.add(new CountriesAndStudents("Kobe Bryant", 24));
		students.add(new CountriesAndStudents("Lebron James", 6));
		students.add(new CountriesAndStudents("Shaq O'neal", 34));
		students.add(new CountriesAndStudents("Anthony Davis", 3));
		
		for( CountriesAndStudents all: students) {
			System.out.println(all.name +" "+all.studentID);
		}

		
		
		
		
	}
}
