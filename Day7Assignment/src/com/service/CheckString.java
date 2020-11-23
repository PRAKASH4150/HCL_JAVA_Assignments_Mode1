package com.service;

public class CheckString {

	public static int checkCharacters(String inputString)
	{
		if(inputString.charAt(0)==inputString.charAt(inputString.length()-1))
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
