package com.encapsulation;

public class EnStudent {

	private String FavPlayer;
	private int age;
	private String FavTeam;
	
	public void Guess(String FavPlayer, String FavTeam) {
		this.FavPlayer = FavPlayer;
		this.FavTeam = FavTeam;
	}
	
	public String answer() {
		if(FavPlayer.equalsIgnoreCase("Kobe")) {
			System.out.println(FavPlayer+" is my favorite player");
			if(FavTeam.equalsIgnoreCase("Lakers")) {
				System.out.println(FavTeam+" is my favorite team");
			}else {
				System.out.println("Not my favorite Team");
			}
		}else {
			System.out.println("Try Again :(( ");
		}
		return FavPlayer;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
}
