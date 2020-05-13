package com.class35;

import java.util.*;

public class Recap_1 {

	public static void main(String[] args) {
		
//		Creating the object of any Set:
			   	Set<Double> setA = new HashSet<>();
			   	setA.add(90.99);
			   	setA.add(90.99);
			   	setA.add(9.99);
			   
			   	Set<Double> setB = new TreeSet<>();
			   	setB.add(90.99);
			   	setB.add(90.99);
			   	setB.add(9.99);
			   
			   	Set<Double> setC = new LinkedHashSet<>();
			   	setC.add(90.99);
			   	setC.add(90.99);
			   	setC.add(9.99);
			   
//			   Retrieve Objects from Set: (elements)
//			    - 1. Iterator
			   Iterator<Double> iterator = setA.iterator();
			   while(iterator.hasNext()){
			   	Double d = iterator.next();
			   	System.out.println(d);
			   }
			   // To remove: if d is less than 50, please remove
			   Iterator<Double> iteratorA = setA.iterator();
			   while(iteratorA.hasNext()){
			   	Double d = iteratorA.next();
			   	if(d<90.00) {
			   		iteratorA.remove();
			   	}
			   	System.out.println(d);
			   }

			   
/* A way to add an entire list onto your set:			   

   Set hs = new LinkedHashSet(aList);
		System.out.println(aList);			   
			   
   NOTE: 
   - you can convert linked HashSet into ArrayList so that you can access indexes		   
 */
			   
			   
			   

	}

}
