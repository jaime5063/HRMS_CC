package com.HashMap;

import java.util.*;

public class HashMap_Print {

	public static void main(String[] args) {
		
		Map<String, Integer> printing = new HashMap<>();
		printing.put("mango", 10);
		printing.put("apple", 30);
		printing.put("orange", 20);
		printing.put("mango", 40);
		printing.put("mango", 40);
		
		System.out.println(printing);

	}

}
