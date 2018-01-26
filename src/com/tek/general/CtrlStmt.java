package com.tek.general;

public class CtrlStmt {


	    public void method(int a,int b){


	        if(a<b) {
	            System.out.println("The a value is smaller :" +a);

	            a = a * b;
	            System.out.println("Now the value of a is greater :"+a);


	        }
	        else {
	            System.out.println("The value of b is smaller :"+b);

	            b = a * b;

	            System.out.println("Now the value of b is greater :"+b);
	        }


	    }

	    public static void main(String[] args){

	        CtrlStmt cs = new CtrlStmt();
	        cs.method(7,9);
	        
	      

	    }
	}

