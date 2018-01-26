package com.tek.general;

public class ControlStmt {
	
	public void ctrlstmt(int sal1)
	{
		if(sal1>8000)
		{
			System.out.println("The manager level sal range is more than $8000 per month ");
			
			if(sal1>11000) {
				System.out.println("This is senior manager sal range: "+ sal1);
			}
			
			else if(sal1<11000 && sal1>8000)
			{
				System.out.println("This is manager sal range: "+ sal1);
			}
			else if(sal1>8000)
			{
				System.out.println("Not a manager");
			}
		}
		
		else {
			
			System.out.println("The Developer level sal range is less than $8000 per month");
			
			if(sal1<8000) {
				
				System.out.println("This is senior Developer sal range: "+sal1);
			}
			
			else if(sal1<8000 && sal1>4000) {
				
				System.out.println("This is Mid-level Developer sal range: "+sal1);
				
			}
			
			else if(sal1<4000) {
				
				System.out.println("This is junior Developer sal range: "+sal1);
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		ControlStmt cs = new ControlStmt();
		cs.ctrlstmt(9000);
		
	}
}
