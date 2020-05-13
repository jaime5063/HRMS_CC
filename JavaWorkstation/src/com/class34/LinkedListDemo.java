package com.class34;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		
		LinkedList<String> llist = new LinkedList<>();
		// adding elemnts
		llist.add("Hello");
		llist.add("Bye");
		llist.add("Hello");
		llist.add("Bye");
		// place specific element at index 2 --> the other indexes will get changed
		llist.add(2, "How are you?");
		System.out.println(llist);

		// replace 1 element
		llist.set(1, "Goodbye");
		System.out.println(llist);
		
		//retrieve 1 element - and storing it in a variable
		String element = llist.get(2);
		System.out.println(element);
		
		// retrieve all elements
		// 1.
		System.out.println("Four loop");
		for(int i = 0 ; i<llist.size(); i++) {
			System.out.println(llist.get(i));
		}
		// 2.
		for(String el:llist) {
			System.out.println(el);
		}
		// 3.
		Iterator<String> it = llist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		/*ArrayList saves everything as a list and make shifts when added or deleted
			LinkedList uses non-sequential data storage
			ArrayList Needs space for at least 10 items
			LinkedList Does not need space and we can even create an empty Linked list of size 0.
			
			ArrayList best to: retrieve list data (95% of the time we will use this type)
			
			LinkList best when: add, remove
		 */
		
		
/* ArrayList vs LinkedList
 * 
 * 1. ArrayList: Dynamic array
 * 	  LinkList: uses linked list
 * 
 * 2. ArrayList: best option for retrieving
 * 	  LinkedList: best choice for adding and removing operations
 * 
 * 
 * 
 * ArrayList vs Array
 * 
 * 1. Array: fixed in size
 *    ArrayList: Dynamic array
 *    
 * 2. Array: contains primitives and non primitives
 * 	  ArrayList: contains only objects 
 * 				(with help of wrapper classes we are able to store numeric, boolean and char type of values.)   
 * 
 *  3. ArrayList: ArrayList.size();
 *     Array: name of the array .length;
 *     
 *  LIST Interface: is Ordered collection that allows duplicates.  
 *  
 *    
 *  NOTE: best way to REMOVE an element from your Collection = Iterator
 *     NOT for loop. This is removing the Index bases on your condition so it will always change
 *     
 *   
 * 		
 */
		
		
		
	}

}
