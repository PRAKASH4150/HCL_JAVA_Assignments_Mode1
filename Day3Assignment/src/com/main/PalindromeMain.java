package com.main;

import java.util.Scanner;

import com.pojo.Palindrome;
/**
 * 
 * @author MokaSaiSuryaPrakash
 *
 * This program checks whether a string is palindrome or not
 */
public class PalindromeMain {

	public static void main(String[] args) {
	
		String inputString=null;
		boolean output;
		
		Scanner scanner=new Scanner(System.in);
		Palindrome palindrome=null;
		
		System.out.println("Enter an input String");
		inputString=scanner.nextLine();
		
		palindrome=new Palindrome();
	    output=palindrome.checkIfPalindrome(inputString);
	    
	    if(output==true)
	    {
	    	System.out.println("The entered string "+inputString+" is a palindrome");
	    }
	    else
	    {
	    	System.out.println("The entered string "+inputString+" is not a palindrome");
	    }
	    
	    palindrome=null;
	    inputString=null;
	    scanner.close();
	}

}
