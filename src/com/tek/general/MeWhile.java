package com.tek.general;

public class MeWhile {
	
	public void myEdu(int age){
		
		while(age>=4) {
			
			System.out.println("At the age  " +age+ "    i was in School ");
			age++;
			if(age>22) {
				
				System.out.println("At the age  " +age+ "    i was working ");
				break;
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		MeWhile mw = new MeWhile();
		mw.myEdu(16);
	}
}
