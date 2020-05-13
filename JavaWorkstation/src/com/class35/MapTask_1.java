package com.class35;

import java.util.*;

public class MapTask_1 {

	public static void main(String[] args) {

/* Create a map of building. Store floor number and it is 
 * associated company name.
 * Insert 7 entries with duplicate keys and values.
 * - Check how many entries you have?
 * - Update company on 4th floor
 * - Remove company on the 7th floor
 * - Print your map		
 */
		
		HashMap<Integer, String> buildingMap = new HashMap<>();
		buildingMap.put(1, "Syntax");
		buildingMap.put(2, "Apple");
		buildingMap.put(3, "Amazon");
		buildingMap.put(4, "Google");
		buildingMap.put(4, "Google");
		buildingMap.put(2, "Apple");
		buildingMap.put(1, "Syntax");
		
		System.out.println("Size is: "+buildingMap.size());
		
		buildingMap.replace(4, "GAP");
		buildingMap.remove(7);
		
		System.out.println(buildingMap);
		
		
		
		
	}

}
