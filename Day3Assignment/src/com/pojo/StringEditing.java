package com.pojo;

public class StringEditing {

	public static String getString(String inputString)
	{
		String outputString=inputString.substring(2);
		
		if(inputString.charAt(0)=='k' && inputString.charAt(1)=='b')
		{
			return(inputString);
		}
		else if(inputString.charAt(0)!='k' && inputString.charAt(1)!='b')
		{
			return(inputString.substring(2));
		}
		else
		{
			if(inputString.charAt(0)=='k'&& inputString.charAt(1)!='b')
			{
              	outputString='k'+outputString;		
			}
			else if(inputString.charAt(0)!='k'&& inputString.charAt(1)=='b')
			{
				outputString='b'+outputString;
			}
			
			return outputString;
		}
	}
	
}
