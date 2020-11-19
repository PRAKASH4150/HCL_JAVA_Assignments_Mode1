package com.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.applicationexceptions.InvalidAgeRangeException;
import com.pojo.ValidateAgeforIPL;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * 
 * This program takes in the name and age of a player and raises exception when the player's age is lessthan 19
 * Under normal conditions it would print the player name and age;
 *
 */
public class InvalidAgeRangeExceptionMain {

	public static void main(String[] args) {
		
		String playerName;
		int playerAge;
		
		Scanner scanner=new Scanner(System.in);
		
		ValidateAgeforIPL iplObj=new ValidateAgeforIPL();
		
		try
		{
			System.out.println("Enter the player name:");
			playerName=scanner.nextLine();
			
			System.out.println("Enter the player age");
			playerAge=scanner.nextInt();
			
			iplObj.validateAndDisplay(playerName,playerAge);
		}
		catch(InvalidAgeRangeException e1)
		{
			System.err.println(e1.getErrorMessage());
		}
		catch(InputMismatchException e2)
		{
			System.err.println("The input type is incompatible");
		}
		
		iplObj=null;
		scanner.close();
	}

}
