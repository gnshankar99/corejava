package com.tek.general;

import java.io.IOException;

public class CarSelect {
	
	public void carModel() throws IOException {
		
		char num;
		
		do {
			
			System.out.println("Available cars are");
			System.out.println("1. Audi Rs7");
			System.out.println("2. Bmw M6");
			System.out.println("3. Acura TLX");
			System.out.println("4. Range rover velar");
			System.out.println("5. Ford Mustang\n");
			System.out.println("Please select the car you want");
			
			num = (char)System.in.read();
			
			
			
		}while(num < '1' || num > '5');
		
		System.out.println("\n");
		
		switch(num) {
		
		case '1':{
			
			System.out.println("You have selected Audi Rs7");
			break;
		}
		
		case '2':{
			
			System.out.println("You have selected Bmw M6");
			break;
			
		}
		
		case '3':{
			
			System.out.println("You have selected Acura TLX");
			break;
		}
		case '4':{
			
			System.out.println("You have selected Range rover velar");
			break;
			
		}
		case '5':{
			
			System.out.println("You have selected Ford Mustang");
			break;
			
		}
		
		
		
		
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		CarSelect cs = new CarSelect();
		cs.carModel();
	}

}
