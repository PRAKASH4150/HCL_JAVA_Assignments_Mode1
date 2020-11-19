package com.main;
import java.util.Scanner;

import com.pojo.MiddleCharacter;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * This program is used to find the middle character of a string as entered by the user.
 */
public class MiddleCharacterMain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		MiddleCharacter middleCharacter=null;
		
		String inputString;
		String result;
		
		System.out.println("Enter a String:");
		inputString=scanner.nextLine();
		
		middleCharacter=new MiddleCharacter();
		
		result=middleCharacter.displayMiddleCharacter(inputString);
		
		System.out.println(result+" is the middle character for "+inputString);
		
		middleCharacter=null;
		scanner.close();
	}

}
