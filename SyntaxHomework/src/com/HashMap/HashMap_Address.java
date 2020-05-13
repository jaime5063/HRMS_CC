package com.HashMap;

import java.util.*;

public class HashMap_Address {

	public static void main(String[] args) {
		
		
		Map<String, String> address = new HashMap<>();
		address.put("Street", "Patrick St");
		address.put("Suite", "265");
		address.put("City", "Vienna");
		address.put("Zip", "22180");
		address.put("Country", "United States");
		
		System.out.println(address.size());
		address.clear();
		System.out.println(address.size());

	}

}
