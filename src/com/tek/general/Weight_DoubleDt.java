package com.tek.general;

public class Weight_DoubleDt {
	
	public void Weight() {
		
		double tire_weight = 41.5;
		double engine_weight = 543.2;
		double body_weight = 311.8;
		
		double all4tire_weight = tire_weight* 4;
		
		double car_weight = all4tire_weight + engine_weight + body_weight;
		
		System.out.println("The weight of a car in pounds is : "+ car_weight);
		
	}
	
	public static void main(String[] args) {
		Weight_DoubleDt wd = new Weight_DoubleDt();
		wd.Weight();
	}

}
