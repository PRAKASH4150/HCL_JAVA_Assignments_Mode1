package com.main;
import java.util.Scanner;

import com.pojo.LowerCase;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * This program converts all the characters in the string in to lower case
 */
public class LowerCaseMain {

	public static void main(String[] args) {

		String inputString;
		
		LowerCase lowerCase=null;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a String:");
		inputString=scanner.nextLine();
		
		lowerCase=new LowerCase();
		System.out.println(lowerCase.convertToLowerCase(inputString));
		
		
		
		
	}

}
