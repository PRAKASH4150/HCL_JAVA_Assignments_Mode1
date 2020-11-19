package com.pojo;

public class FizzBuzzApplication {
	
	public String[] checkFizzandBuzz(int arraySize)
	{
		String[] stringArray=new String[arraySize];
		for(int i=1;i<=arraySize;i++)
		{
			if(((i%3)==0) &&((i%5)==0))
			{
				stringArray[i-1]="FizzBuzz";
			}
			else if(i%3==0)
			{
				stringArray[i-1]="Fizz";
			}
			else if(i%5==0)
			{
				stringArray[i-1]="Buzz";
			}
			
			else
			{
				stringArray[i-1]=Integer.toString(i);
			}
		}
		return stringArray;
	}

}
