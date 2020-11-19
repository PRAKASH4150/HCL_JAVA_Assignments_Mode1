package com.main;
import java.util.Scanner;

import com.pojo.ASCIIValue;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * This program is used to check the ASCII value of any entered character by the user 
 * 
 */
public class ASCIIValueMain {

	public static void main(String[] args) {
		
		char letter;
		int asciiVal;
		
		ASCIIValue asciiValue=null;
	    Scanner scanner=new Scanner(System.in);
	    
	    System.out.println("Enter a character:");
	    letter=scanner.next().charAt(0);
	    
	    asciiValue=new ASCIIValue();
	    asciiVal=asciiValue.getASCIIValue(letter);
	    
	    System.out.println("The ASCII Value for the character "+letter+" is: "+asciiVal);
	    
	    asciiValue=null;
	    scanner.close();
	}
	
    
}

