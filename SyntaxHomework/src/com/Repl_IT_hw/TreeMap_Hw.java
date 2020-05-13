package com.Repl_IT_hw;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Hw {

	public static void main(String[] args) {
		
	/* #206 validate below and print the results (TreeMap)
	 	is Contain Key 3?
		is Contain Values 4.4?
		is Contain  key 6?	
	*/
		System.out.println();
	Map<Integer, Double> numTree = new TreeMap<>();
	numTree.put(1, 1.1);
	numTree.put(2, 2.2);
	numTree.put(3, 3.3);
	numTree.put(4, 4.4);
	numTree.put(5, 5.5);
	
	System.out.println(numTree.containsKey(3));
	System.out.println(numTree.containsValue(4.4));
	System.out.println(numTree.containsKey(6));

	}

}
