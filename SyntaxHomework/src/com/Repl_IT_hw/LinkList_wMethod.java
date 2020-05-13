package com.Repl_IT_hw;

import java.util.*;

public class LinkList_wMethod {

	String firstName, middleName, lastName;

	public LinkList_wMethod(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public void displayName() {
		System.out.println(firstName);
		System.out.println(middleName);
		System.out.println(lastName);
	}
}

class ArrayListHw1 {
	public static void main(String[] args) {

		List<LinkList_wMethod> all = new LinkedList<>();
		all.add(new LinkList_wMethod("Test", "Brian", "Ryan"));

		Iterator<LinkList_wMethod> element = all.iterator();
		while (element.hasNext()) {
			element.next().displayName();
		}
	}
}
/*	Create a method the return an LinkList. without parameters. 
	inside the method put the logic to add below values to the linklist 
	and return the list. 

	In Main Class. 
	call the method and store it to a new Linklist. 
Print the values of LinkList. 
Output:
John
Brian
Ryan	
*/