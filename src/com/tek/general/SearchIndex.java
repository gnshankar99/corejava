package com.tek.general;

import java.io.IOException;
import java.util.Scanner;

public class SearchIndex {
	
	public void numSearch() throws IOException {
		int input;
		Scanner s=new Scanner(System.in);
		
		
		int nums[] = {1,8,5,3,0,2,9,6,4};
		boolean found;
		int n = 0;
		
		System.out.println("Please enter the number to searched");
		
		input = s.nextInt();
		
		for(int check:nums) {
			
			
		
			
			if(check==input) {
				
				System.out.println("the array index of the input is: "+n);
				
				found = true;
				break;
				
				
				
			}
			
			n++;
		}
		s.close();
		
		
		
		
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
		SearchIndex si = new SearchIndex();
		si.numSearch();
	}

}
