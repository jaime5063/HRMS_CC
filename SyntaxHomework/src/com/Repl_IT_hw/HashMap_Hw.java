package com.Repl_IT_hw;

import java.util.*;
import java.util.Map.Entry;

public class HashMap_Hw {

	public static void main(String[] args) {
		/* 							----- note -----	
		HashMap entrySet() Method in Java
		util. HashMap. entrySet() method in Java is used to create a set
		out of the same elements contained in the hash map. It basically
		returns a set view of the hash map.
	*/		
		
	// #203 Print all the values using loop and KeySet. 		
		Map<String, String> hM = new HashMap<>();		
		hM.put("Steet", "Patrick ST");
		hM.put("Suite", "265");
		hM.put("City", "Vienna");
		hM.put("Zip", "22180");
		hM.put("Ccountry", "United State");
		
		for(String mapping: hM.keySet()) {
			System.out.println(hM.get(mapping));
		}
		System.out.println();
		
	// #204 Print all the values using entrySet in upper case. 		
		Map<String, String> mapString = new HashMap<>();
		mapString.put("Steet", "Patrick ST");
		mapString.put("Suite", "265");
		mapString.put("City", "Vienna");
		mapString.put("Zip", "22180");
		mapString.put("Ccountry", "United State");
		
		Iterator<Map.Entry<String, String>> setEntry = mapString.entrySet().iterator(); 
		while(setEntry.hasNext()) {
			System.out.println(setEntry.next().getValue().toUpperCase());
		}
	// #205	Print all keys using iterator
		System.out.println();
		Map<String, String> lHasMap = new LinkedHashMap<>();
		lHasMap.put("Steet", "Patrick ST");
		lHasMap.put("Suite", "265");
		lHasMap.put("City", "Vienna");
		lHasMap.put("Zip", "22180");
		lHasMap.put("Ccountry", "United State");
		
		Iterator<Map.Entry<String, String>> itPrint = lHasMap.entrySet().iterator();
		while(itPrint.hasNext()) {
			System.out.println(itPrint.next().getKey());
		}	
		
	/* #207
		Create a Hash Map of String pairs 
		add the follow values
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");
		
		print the key and values pairs using loop
		
		Remove below from Map
		"ONE"
		"FOUR"
		
		Print key and values pairs using loop
		
		OUTPUT
		 
		HashMap Before Remove :
		FIVE : EEE
		ONE : AAA
		FOUR : DDD
		TWO : BBB
		THREE : CCC
		------------------
		HashMap After Remove :
		FIVE : EEE
		TWO : BBB
		THREE : CCC
	 */
		System.out.println("HashMap Before Remove:");
		Map<String, String> printHash = new HashMap<>();
		printHash.put("ONE", "AAA");
		printHash.put("TWO", "BBB");
		printHash.put("THREE", "CCC");
		printHash.put("FOUR", "DDD");
		printHash.put("FIVE", "EEE");

		Set<Entry<String, String>> hashMapSet = printHash.entrySet();

		Iterator<Map.Entry<String, String>> printing = printHash.entrySet().iterator();
		while (printing.hasNext()) {
			Entry<String, String> p = printing.next();
			System.out.println(p.getKey() + " : " + p.getValue());
		}
		System.out.println("HashMap After Remove:");
		printHash.remove("ONE");
		printHash.remove("FOUR");

		for (Entry<String, String> forPrint : hashMapSet) {
			System.out.println(forPrint.getKey() + " : " + forPrint.getValue());

		}
/*Create Hash Map. 
add the follow values

map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");

- print the key and values pairs using iterator only
- replace with below key THREE--> ASEL and key FIVE-->SUMAIR
- Print the values using any kind of loops you like.

OUTPUT:::
HashMap Before Replace :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Replace :
FIVE : SUMAIR
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : ASEL		
 */
	System.out.println("HashMap Before Replace: ");	
	Map<String, String> str = new HashMap<>();
	str.put("ONE", "AAA");
	str.put("TWO", "BBB");
	str.put("THREE", "CCC");
	str.put("FOUR", "DDD");
	str.put("FIVE", "EEE");
	
	Set<Entry<String, String>> mapping = str.entrySet();
	
	Iterator<Map.Entry<String, String>> strP = str.entrySet().iterator();
	while(strP.hasNext()) {
		Entry<String, String> print = strP.next();
		System.out.println(print.getKey()+" :" +print.getValue());
	}
	
	str.replace("THREE", "ASEL");
	str.replace("FIVE", "SUMAIR");
	
	System.out.println("HashMap After Replace: ");	
	for(Entry<String,String> fLoop: mapping) {
		System.out.println(fLoop.getKey()+" :" +fLoop.getValue());
	}


	
	}
}


















