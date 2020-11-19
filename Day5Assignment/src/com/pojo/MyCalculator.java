package com.pojo;

import com.applicationexceptions.UserDefinedException;

public class MyCalculator {
	private int result;
	
	public long power(int base,int power) throws UserDefinedException
	{
		if(base<0 || power<0)
		{
			throw new UserDefinedException("Base or Power should not be negative");
		}
		
		else if(base==0 && power==0)
		{
			throw new UserDefinedException("Base and Power should not be zero");
		}
		
		else
		{
			result=(int) Math.pow(base,power);
			return result;
		}
	}

}
