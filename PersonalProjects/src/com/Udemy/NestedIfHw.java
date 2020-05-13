package com.Udemy;

import java.util.Scanner;

public class NestedIfHw {

	public static void main(String[] args) {

		System.out.println("Is it sunny outside?");
		Scanner scan = new Scanner(System.in);
		boolean isSunny = scan.nextBoolean();

		if (isSunny = true) {
			System.out.println("it is a sunny day i should go somewhere");
			int temp = scan.nextInt();
			if (temp >= 85) {
				System.out.println("Im going to the beach");
			} else {
				System.out.println("I am going to the park");
			}
		}

		
	}
}
/*
 * For you to do: Declare boolean variable isSunny, ask the user
 * "Is it sunny outside?" Declare int temperature and ask user to input any
 * value.
 * 
 * Your program should check: If the weather is sunny output should be
 * "It is a sunny day, I should go somewhere!" If it is not sunny output should
 * be "I stay home and practice Java"
 * 
 * If the weather is sunny you want to check the temperature
 * "What is the temperature outside?" If the temperature is higher than 85 then
 * "I am going to the beach" otherwise, "I am going to the park"
 * 
 * Example Output: Is it sunny outside? It is a sunny day, I should go
 * somewhere! What is the temperature outside? I am going to the beach!
 * 
 * Example Output: Is it sunny outside? I stay home and practice Java!
 * 
 * Example Output: Is it sunny outside? It is a sunny day, I should go
 * somewhere! What is the temperature outside? I am going to the park!
 */