package com.service;

public class Number implements Runnable {

	private int inputNumber;
	
	public Number(int inputNumber)
	{
		this.inputNumber=inputNumber;
	}
	public void run() {
		
		System.out.println("The multiples of "+inputNumber+" are: ");
		for(int i=this.inputNumber;i<=50;i++)
		{
			if((i%this.inputNumber)==0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println("");
		
	}

	
}
