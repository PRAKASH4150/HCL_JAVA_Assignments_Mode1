package com.pojo;

public class LargestWord {

	private static int temp;
	public static String getLargestWord(String sentence)
	{
		String[] stringArray = sentence.split("\\s+");
		
		int length = stringArray[0].length();
		int heighest = 0;
		
		for (temp = 1; temp < stringArray.length; temp++) {
		
			if (stringArray[temp].length() > length) {
				length = stringArray[temp].length();
				heighest = temp;
			}
		}
		return stringArray[heighest];
		
	}
}
