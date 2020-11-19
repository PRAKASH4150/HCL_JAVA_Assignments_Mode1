package com.main;

import java.util.Scanner;

import com.pojo.Panagram;
/**
 * 
 * @author MokaSaiSuryaPrakash
 *
 *This program is used to check whether an entered string is pangram or not
 * Pangrams are words or sentences containing every letter of the alphabet at least once
 */
public class PanagramMain {

	public static void main(String[] args) {
		
	   Scanner scanner=new Scanner(System.in);
	   Panagram panagram=null;
	   
	   String inputString=null;
	   boolean output;
	   
	   System.out.println("Enter a string");
	   inputString=scanner.nextLine();
	   
	   panagram=new Panagram();
	   output=panagram.checkIfPanagram(inputString);
	   
	   if(output)
	   {
		   System.out.println("Panagram");
	   }
	   else
	   {
		   System.out.println("Not a Panagram");
	   }
	   
	   scanner.close();
	   panagram=null;
	   inputString=null;
	}

}
