package com.MapHw_Task;

import java.util.*;
import java.util.Map.Entry;

public class BestBuy_Map {

	public static void main(String[] args) {
		
/*Create a map of Best Buy store. Place
  item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )

  Retrieve all keys and values from a Best Buy map using EntrySet. 		
 */		
		Map<Integer, String> shop = new LinkedHashMap<>();
		shop.put(1880, "Samsung TV");
		shop.put(1881, "iPad");
		shop.put(1882, "iPhone");
		shop.put(1883, "LG Speaker");
		shop.put(1884, "iMac");
		shop.put(1885, "Blue Ray DVD");
		shop.put(1886, "Playstation 4");
		shop.put(1887, "X Box 360");
		shop.put(1888, "Drone");
		shop.put(1889, "Surround sound");

		Set<Entry<Integer, String>> bbSet = shop.entrySet();

		System.out.println("    For Loop Print:");
		for (Entry<Integer, String> bbEntry : bbSet) {
			System.out.println(bbEntry.getKey() + ": " + bbEntry.getValue());
			// can also print as below: assigning a String variable
//			String element = bbEntry.getKey() + ": " + bbEntry.getValue();
//			System.out.println(element);
		}

		System.out.println("    Iterator Print:");
		Iterator<Entry<Integer, String>> bbEntIt = bbSet.iterator();
		while (bbEntIt.hasNext()) {
			Entry<Integer, String> bbEntry = bbEntIt.next();
			Integer entryKey = bbEntry.getKey();
			String entryVal = bbEntry.getValue();
			System.out.println(entryKey + "_" + entryVal);
		}

	}
}



