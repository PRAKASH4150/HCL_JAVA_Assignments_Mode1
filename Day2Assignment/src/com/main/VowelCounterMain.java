package com.main;

import java.util.Scanner;
import com.pojo.VowelCounter;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * 
 * This program is used to find the number of vowels present in a string
 *
 */
public class VowelCounterMain {

	public static void main(String[] args) {
		
     Scanner scanner=new Scanner(System.in);
     VowelCounter vowelCounter=null;
     
     String inputWord;
     int result;
     
     System.out.println("Enter the word:");
     inputWord=scanner.nextLine();
     
     vowelCounter=new VowelCounter();
     result=vowelCounter.vowelCountCheck(inputWord);
     System.out.println("The total number of vowels in the word "+inputWord+" is:"+result);
     
     vowelCounter=null;
     scanner.close();
	}

}
