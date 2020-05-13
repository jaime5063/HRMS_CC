package com.Repl_IT_hw;

import java.util.*;

//import com.class34.Sweets;

public class ArrayListHw {
	public static void main(String[] args) {
	
/* 1. Create a ArrayList of Integers called listA
add below values to it. 
(0, 1, 2, 3, 4, 5)
Create another array list of Integer. called listB

Create a logic to the values of listA to listB twice for each values. create a logic the 

Print the listB

Output
[0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
 */
	ArrayList <Integer> listA = new ArrayList<>();
	listA.add(0);
	listA.add(1);
	listA.add(2);
	listA.add(3);
	listA.add(4);
	listA.add(5);
	ArrayList <Integer> B = new ArrayList<>();
	B.add(0);
	B.add(1);
	B.add(2);
	B.add(3);
	B.add(4);
	B.add(5);
	
	for(int i=0; i<listA.size(); i++) {
		System.out.println(listA.get(i)+""+B.get(i));
	}
	
/* 2. Create a ArrayList of type boolean called listA
	add below to list values
	(true, false, false)	
	Create another array list call listB
	then write a logic to add the same values of listA to list B twice. 
	Print the List. 
	Output
	[true, false, false, true, false, false]
 */
	List<Boolean> list = new ArrayList<>();
	list.add(true);
	list.add(false);
	list.add(false);	
	List<Boolean> listB = new ArrayList<>();
	listB.add(true);
	listB.add(false);
	listB.add(false);
		list.addAll(listB);
		System.out.println(list);
	
/*Create a linkList of type Integer call list, 
	Add the values below. 
	111
	222
	333
	444
	555
	666	
	Create a logic to calculate sum of the all the values in list. 
	Print the result only. 
	  Output. 
	  Result of sum is 2331
 */	
		List<Integer> list2 = new LinkedList<>();
		list2.add(111);
		list2.add(222);
		list2.add(333);
		list2.add(444);
		list2.add(555);
		list2.add(666);

		int sum = 0;

		for (int i : list2) {
			sum += i;
		}
		System.out.println("Result of sum is "+sum);
		
/*Create a method the return an LinkList. without parameters. 
	inside the method put the logic to add below values to the linklist and return the list. 
	
	In Main Class. 
	call the method and store it to a new Linklist. 
	
	Print the values of LinkList. 
	
	
	Output
	
	John
	Brian
	Ryan	
 */
 System.out.println("------Linked list with method ------");

 

 List<LinkList_wMethod> all = new LinkedList<>();
 all.add(new LinkList_wMethod("Test", "Brian", "Ryan"));
 
 Iterator<LinkList_wMethod> element = all.iterator();
	while(element.hasNext()) {
		element.next().displayName();
	}
 
 
 
		
		
		
	}
}















