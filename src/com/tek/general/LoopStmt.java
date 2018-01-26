package com.tek.general;

public class LoopStmt {

	
	public void forLoop(){

        int num = 10;

        System.out.println("The numbers from 1 to 10 ");

        for(int i=1;i<=num;i++){

           // if()

            //i = i+1;
            System.out.println(i);

        }
    }

    public static void main(String[] args){

        LoopStmt ls = new LoopStmt();
        ls.forLoop();

    }
}
