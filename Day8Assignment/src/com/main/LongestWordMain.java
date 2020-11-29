package com.main;

import com.service.LongestWord;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * 
 * . Write a Java program to find the longest word in a text file
 *
 */
public class LongestWordMain {

	public static void main(String[] args) {

		String output;
		LongestWord longestWord=new LongestWord();
		
		output=longestWord.getLongestWord();
		
		System.out.println("The longest Word is:"+output);
	    
	}

}
