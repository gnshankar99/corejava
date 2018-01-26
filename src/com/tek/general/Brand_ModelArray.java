package com.tek.general;

public class Brand_ModelArray {
	
	public void brand() {
		
		String brand_name[] = {"Audi","Range rover","Bmw"};
		
		System.out.println("The value at the array location brand_name[1] is " +brand_name[1]);
		
	}
	
	
public void model() {
		
		String model_name[] = {"Rs7","Velar","M6"};
		
		System.out.println("The value at the array location model_name[1] is " +model_name[1]);
		
	}

public static void main(String[] args) {
	
	Brand_ModelArray bm = new Brand_ModelArray();
	bm.brand();
	bm.model();
}

}
