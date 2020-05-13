package com.class36;

/* Create a car class that will have variables, methods and constructor
 *  Create a map that will hold car number and car objects store in it	
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Car {

 	String make, model;

 	public Car(String make, String model) {
 		this.make = make;
 		this.model = model;
 	}

 	public void display() {
 		System.out.println(make+" "+model);
 	}
 }

public class CarTest {

	public static void main(String[] args) {
		
		Map<Integer, Car> mapCar=new LinkedHashMap<>();
 		mapCar.put(1, new Car("BMW", "X5"));
 		mapCar.put(2, new Car("Tesla", "S"));
 		mapCar.put(3, new Car("Mercedes", "S5"));
 		mapCar.put(4, new Car("Toyota", "Rav4"));
 		mapCar.put(5, new Car("Honda", "Civic"));
 		mapCar.put(2, new Car("Lincoln", "Mkc"));	

 		Set<Entry<Integer, Car>> set=mapCar.entrySet();
 		
 		Iterator<Entry<Integer, Car>> itAll = set.iterator();
 		while(itAll.hasNext()) {
 			Entry<Integer, Car> carz = itAll.next();
 			System.out.println(carz.getKey()+" "+carz.getValue().make);
 		}
 		
}
}


