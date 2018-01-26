package com.tek.general;

public class NameStr {
	
public void myName(String s) {
		
	boolean t = true;
		
		System.out.println("My name is shankar  " + t);
		
	}

public void name(String s) {
	
	boolean f = false;
	
	System.out.println("My name is ram  " + f);
	
}
	
			
		
	public static void main(String[] args) {
		
		NameStr ns = new NameStr();
		ns.myName("shankar");
		ns.name("ram");
		
		
	}

}
