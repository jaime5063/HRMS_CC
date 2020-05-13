package com.class36;

import java.util.*;

public class Collection_Task {

	public static void main(String[] args) {

/*Create the collection that will store single uniques Objects of a String type
 *  in which order is preserved.
	Write a logic to concatenate all string from the collection.	
 */		
	Set<String> obj = new LinkedHashSet<>();
	obj.add("Tables");
	obj.add("Strings");
	obj.add("Chairs");
	obj.add("Towels");
	obj.add("Glass");
	
	Iterator<String> itObj = obj.iterator();
	while(itObj.hasNext()) {
		String allObj = itObj.next();
		System.out.println(allObj);
	}
	
	
		
		

	}

}
