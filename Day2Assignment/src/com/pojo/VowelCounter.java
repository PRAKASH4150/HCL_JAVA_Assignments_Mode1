package com.pojo;

public class VowelCounter {

	private int size;
    private int count=0;
    
	public int vowelCountCheck(String word)
	{
		size=word.length();
		for(int i=0;i<size;i++)
		{
			if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u')
			{
				count=count+1;
			}
			else if(word.charAt(i)=='A' || word.charAt(i)=='E' || word.charAt(i)=='I' || word.charAt(i)=='O' || word.charAt(i)=='U')
			{
				count=count+1;
			}
		}
	    return(count);
	}
}
