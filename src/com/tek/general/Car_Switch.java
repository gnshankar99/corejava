package com.tek.general;

public class Car_Switch {
	
	public void car() {
		
		String brand_name[] = {"Audi","Range rover","Bmw","1"};
		
		for(int i=0; i<brand_name.length; i++) {
			 
			switch(brand_name[i]){
			
			case "Audi":
			{
				System.out.println("The brand name of the car is Audi");
				break;
			}
			
			case "Range rover":
			{
				System.out.println("The brand name of the car is Range rover");
				break;
			}
			
			case "Bmw":
			{
				System.out.println("The brand name of the car is Bmw");
				break;
			}
			
			default:
			{
				System.out.println("There is no brand name");
			}
				
		}
		
		
		
		
		
		
	}

 }
	
 public static void main (String[] args) {
	 
	 Car_Switch cs = new Car_Switch();
	 cs.car();
	 
 }
 
}
