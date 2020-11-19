package com.pojo;

public class MiddleCharacter {

	public String displayMiddleCharacter(String inputString)
	{
		int strLength;
		int index;
		strLength=inputString.length();
		
		if((strLength%2)!=0)
		{
			index=(strLength+1)/2;
			
			return inputString.substring(index-1,index);
		}
		else
		{
			index=(strLength)/2;
			
			return inputString.substring(index-1,index+1);
		}
	}
}
