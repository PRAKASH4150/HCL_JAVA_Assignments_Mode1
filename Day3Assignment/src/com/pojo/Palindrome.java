package com.pojo;

public class Palindrome {
	
	public boolean checkIfPalindrome(String inputString)
	{
		StringBuffer initialString=new StringBuffer(inputString);
		StringBuffer reversedString=new StringBuffer(inputString);
		
		reversedString=reversedString.reverse();
		
		if((initialString.toString()).equals(reversedString.toString()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
