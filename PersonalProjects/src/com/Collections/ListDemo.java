package com.Collections;

import java.util.ArrayList;

class Student{
	int roll;
	String name;
}

public class ListDemo {

	public static void main(String[] args) {
		
		// list1 Can only store String objects
		ArrayList<String> list1 = new ArrayList<>();
		
		// list2 can store any type of Object
		ArrayList list2= new ArrayList<>();
		
		Student s1 = new Student();
		s1.roll = 101;  // comes from Student Class
		s1.name = "Mike"; //  comes from Student Class

		
		//1. Add data in list1 (Strings)
		list1.add("John");		//0
		list1.add("Jennie");  	//1
		list1.add("Jim");		//2
		list1.add("Jack");		//3
		list1.add("John");		//4
		list1.add("Joe");		//6
	  //list1.add(10);  // error (integer)
		
		//2. Add data in list2 (any type or Object)
		list2.add("John");
		list2.add(10);
		list2.add(2.2);
		list2.add('A');
		list2.add(s1); // here we added the objects from s1
		
		//Print reference to list --> should print elements in list in sequence we added them
		System.out.println("list1 is: "+list1);
		System.out.println("list2 is: "+list2);
		
		// 2. Get the element from list
		String name = list1.get(2); // .get index @2
		
	}
}
