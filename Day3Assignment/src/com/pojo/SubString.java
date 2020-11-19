package com.pojo;

public class SubString {

	private String outputString;
	
	public String getSubString(String inputWord,int index1,int index2)
	{
		outputString=inputWord.substring(index1, index2);
		
		return outputString;
	}
}
