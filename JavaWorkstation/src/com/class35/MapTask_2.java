package com.class35;

import java.util.*;

public class MapTask_2 {

	public static void main(String[] args) {
		
		Map<String, String> countries = new LinkedHashMap<>();
		countries.put("Mexico", "MX D.F");
		countries.put("USA", "Washington DC");
		countries.put("Germany", "Berlin");
		countries.put("Russia", "Ankara");
		countries.put("Canada", "Ottowa");
		
		Set<String> cKey = countries.keySet();
		
		//Print all keys and values: for each loop
		for(String forLoop: cKey) {
			System.out.println(forLoop+"_"+countries.get(forLoop));
		}
		
		//Print all keys and values: Iterator
		Iterator<String> iterateC = cKey.iterator();
		while(iterateC.hasNext()) {
			String iterateKey = iterateC.next();
			String iterateValue = countries.get(iterateKey);
			System.out.println(iterateKey+"_"+iterateValue);
		}	
/*NOTE:
	method: entrySet() --> get collection of unique Entry Object

*/	

	}

}
