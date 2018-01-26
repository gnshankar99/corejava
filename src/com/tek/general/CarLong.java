package com.tek.general;

public class CarLong {
	
	public void Audi() {
		
		//speed of audi in mph
		int speed = 140;
		
		int weeks = 21;
		
		long minutes = weeks * 7 * 24 * 60;
		
		long miles = speed * minutes;
		
		System.out.println("The no of miles travelled by audi car in 21 weeks is:" + miles);
		
		
		
		
		
	}
	
	public void Toyota() {
		

		//speed of toyota in mph
		int speed = 100;
		
		int weeks = 21;
		
		long minutes = weeks * 7 * 24 * 60;
		
		long miles = speed * minutes;
		
		System.out.println("The no of miles travelled by toyota car in 21 weeks is:" + miles);
		
	}
	
	public static void main(String[] args) {
		
		CarLong cr = new CarLong();
		cr.Audi();
		cr.Toyota();
	}
}
