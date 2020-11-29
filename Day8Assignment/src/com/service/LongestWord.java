package com.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWord {

	private String longestWord="";
	private String current;
	
	public String getLongestWord()
	{
		try {
			Scanner scanner=new Scanner(new FileInputStream("C:\\Users\\Hi\\Desktop\\HCL\\online_training_HCL\\Files\\LongestWord.txt"));
			
			while(scanner.hasNext())
			{
				current=scanner.next();
				
				if(current.length()>longestWord.length())
				{
					longestWord=current;
				}
			}
			
			scanner.close();
		    } 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		return longestWord;
		
	}
}
