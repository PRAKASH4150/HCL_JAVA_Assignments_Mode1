package com.main;
import java.util.Scanner;
import com.pojo.EditString;
/**
 * 
 * @author MokaSaiSuryaPrakash
 *
 *This program is used to reverse the input string and seperate each character of the string by a specified character
 */
public class EditStringMain {

	public static void main(String[] args) {
 	 
		String inputString;
		char seperator;
		String outputString;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Input String");
		inputString=scanner.nextLine();
		
		System.out.println("Enter the Separating character");
		seperator=scanner.next().charAt(0);
		
		outputString = EditString.reshape(inputString, seperator);
		
		System.out.println(outputString);
		
		inputString=null;
		outputString=null;
		scanner.close();
     
	}

}
