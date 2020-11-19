package com.pojo;

import com.applicationexceptions.InvalidAgeRangeException;

public class ValidateAgeforIPL {

	public void validateAndDisplay(String name, int age) throws InvalidAgeRangeException
	{
		if(age<19)
		{
			throw new InvalidAgeRangeException("You are not eligible to play IPL");
		}
		else
		{
			System.out.println("Player Name:"+name);
			System.out.println("Player Age"+age);
		}
	}
}
