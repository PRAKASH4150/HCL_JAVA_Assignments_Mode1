package com.pojo;

public class MyCalculator implements AdvancedArithmetic{
	
	private int sum=0;
	
	public int divisor_sum(int number)
	{
		for(int i=1; i<=number;i++)
		{
			if(number%i==0)
			{
				sum+=i;
			}
		}
		
		return sum;
	}

}
