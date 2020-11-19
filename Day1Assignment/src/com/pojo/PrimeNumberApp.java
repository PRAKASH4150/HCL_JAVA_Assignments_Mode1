package com.pojo;

public class PrimeNumberApp {

	public int checkPrimeOrComposite(int num)
	{
		int remainder=0;
		
		if(num==1)
		{
			return -1;
		}
		else
		{
			for(int i=2;i<=num;i++)
			{
				if(num % i==0)
				{
					remainder=remainder+1;
				}
			}
		  
			if(remainder==1)
			{
				return 1;
			}
			
			else
			{
				return 0;
			}
		}
	}
	
}
