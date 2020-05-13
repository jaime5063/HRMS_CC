package com.class36;

import java.util.*;
import java.util.Map.Entry;

public class MapEmployee_Task {

	public static void main(String[] args) {
/*Create a Map that will store Employee name and salary. 
 * Write a logic to retrieve an employee who gets the highest salary. 
 * Output should be in the below format
	John Smith=$100000	
 */		
		Map<String, Integer> employee = new HashMap<>();
		employee.put("John", 45000);
		employee.put("Lisa", 65000);
		employee.put("Mike", 90000);
		employee.put("Brandon", 84000);
		employee.put("June", 91000);

		System.out.println(employee);
		Integer maxSal = 0;
		Collection<Integer> emp = employee.values();

		for (Integer one : emp) {
			if (one > maxSal) {
				maxSal = one;
			}
		}
		Set<Entry<String, Integer>> keyEntry = employee.entrySet();

		for (Entry<String, Integer> keyz : keyEntry) {
			if (keyz.getValue() == maxSal) {
				System.out.println(keyz);
			}
		}
	}
}
