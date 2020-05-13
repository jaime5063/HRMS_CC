package com.class34;

import java.util.*;

class Sweets{
	
	String name;
	
	Sweets(String name){
		this.name = name;
	}
	
	public void iLove() {
		System.out.println("I love "+name);
	}
}

public class LinkedListDemo2 {

	public static void main(String[] args) {
		
		// create a list of sweet objects (LinkList). Referring to the parent (List)
		List<Sweets> sweetList = new LinkedList<>();
		sweetList.add(new Sweets("Chocolate"));
		sweetList.add(new Sweets("cake"));
		sweetList.add(new Sweets("Cookies"));
		sweetList.add(new Sweets("Macaroons"));
		
		// lets display name of each sweet object
		for(Sweets element: sweetList) {
			System.out.println(element.name);
			element.iLove();
		}
		// retrieve 1 element and accessing method (2 step)
		Sweets mySweet = sweetList.get(2);
		mySweet.iLove();
		
		// retrieve 1 element and accessing method (1 step)
		sweetList.get(2).iLove();
		
		String nameOfTheSweet = sweetList.get(2).name;
		System.out.println(nameOfTheSweet);
		
		
		
		
		
		
		
		
		
		
	}
}
