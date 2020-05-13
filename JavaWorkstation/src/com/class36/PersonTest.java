package com.class36;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class PersonTest {

		public static void main(String[] args) {
			
			Map<Integer, Person> personMap = new LinkedHashMap<>();
			personMap.put(1, new Person("Joe","Smith", 33, 80000));
			personMap.put(2, new Person("Sam","Jones", 59, 45000));
			personMap.put(3, new Person("John","Snow", 23, 72000));
			personMap.put(4, new Person("Lala","Anthony", 30, 100000));
			
			Set<Entry<Integer, Person>> pEntry = personMap.entrySet();
			for(Entry<Integer, Person> ppl:pEntry) {
				System.out.println(ppl.getKey()+" : ");
				ppl.getValue().display();
			}
		}
	}
