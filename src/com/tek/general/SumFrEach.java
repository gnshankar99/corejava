package com.tek.general;

public class SumFrEach {
	
	public void sumAll() {
		
		int nums[] = {1,2,3,4,5,6,7,8,9,10};
		int count;
		for(int increment:nums) {
			
			System.out.println("The present value is " +increment);
			count = increment;
			
			increment = increment + count;
			System.out.println("The sum till now is " + increment);
			
			
			
		
		
			
		}
			
	}
	
	public static void main(String[] args) {
		
		SumFrEach sf = new SumFrEach(); 
		sf.sumAll();
	}

}
