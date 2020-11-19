package com.pojo;

public class CharacterReplacing {
	
	private int wordLength;
	private char[] charWord;

	public String replaceCharacter(String word)
	{
	    wordLength=word.length();
	    charWord=word.toCharArray();
	    
	    for(int i=0;i<wordLength;i++)
	    {
	    	if(word.charAt(i)=='d')
	    	{
	    	  charWord[i]='h';
	    	}
	    }
	    
	    return(String.valueOf(charWord));
	}

}
