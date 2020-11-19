package com.pojo;

public class UserMainCode {

	 

	public static int sumOfSquaresOfEvenDigits(int num)
	{
		int temp;
		int sum = 0;
		
	  while(num!=0)
	  {
		  temp=num%10;
		   
		   if(temp%2==0)
		   {
			   sum=sum+(temp*temp);
		   } 
		   else
		   {
			   sum=sum;
		   }
		   
		  num=num/10;
	  }
	  return sum;
	}

}
