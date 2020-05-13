package com.class36;

import java.util.*;
import java.util.Map.Entry;

class Person {
	
	private String name;
	private String lastName;
	private int age;
	private int salary;
	
	public Person(String name, String lastName, int age, int salary) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}
		public void display() {
			System.out.println(name+" "+lastName+" "+age+" "+salary);
		}
}




