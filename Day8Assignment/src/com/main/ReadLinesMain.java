package com.main;

import java.util.Scanner;

import com.service.ReadLines;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * 
 * Java program to read first 3 lines from a file.
 *
 */
public class ReadLinesMain {

	public static void main(String[] args) {
		
	   int numLines;
	   
	   Scanner scanner=new Scanner(System.in);
	   ReadLines readLines=null;
	   
	   System.out.println("Enter the number of lines you want to read from the file:");
	   numLines=scanner.nextInt();
	  
	   readLines=new ReadLines();
	   readLines.getRequiredLines(numLines);
	   
	   readLines=null;
	   scanner.close();
	   
	}

}
