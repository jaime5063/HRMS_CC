package com.HashMap;

import java.util.*;

public class Map_List {

	public static void main(String[] args) {
		
		List<Map<String, Object>> dataList = new ArrayList<>();

		
		Map<String, Object> appleMap = new LinkedHashMap<>();
		appleMap.put("Items", "Apple");
		appleMap.put("Price", 20.00);
		appleMap.put("Quantity", 10);
			dataList.add(appleMap);
		
		
		Map<String, Object> orangeMap = new LinkedHashMap<>();
		orangeMap.put("Items", "Orange");
		orangeMap.put("Price", 21.99);
		orangeMap.put("Quantity", 10);
			dataList.add(orangeMap);
			

			
			
			
			
			
			
			
			
			for(Map<String, Object> a: dataList) {
			Object one = a.get("Items");

			double pr = (double) a.get("Price");
			int quant = (int) a.get("Quantity");
			
			System.out.println(one+" Price: "+pr+" ");
			
			
			
			System.out.println("------------------------------");
//			double total = pr * quant;
//			System.out.println("SubTotal: " + total);

			
			}
		
		
		
		
		
		
	}

}
