package com.main;

import java.util.Scanner;

import com.service.CheckString;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * 
 * program to read a string and to test whether first and last character are same. 
 * The string is said to be be valid if the 1st and last character are the same.
 * Else the string is said to be invalid.
 *
 */
public class CheckStringMain {

	public static void main(String[] args) {
		
		String inputString;
		int result;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the string");
		inputString=scanner.nextLine();
		
		result=CheckString.checkCharacters(inputString);
		
		if(result==1)
		{
			System.out.println("The String "+inputString+" is valid");
		}
		else if(result==-1)
		{
			System.out.println("The String "+inputString+" is invalid");
		}
		
		scanner.close();
	}
}
