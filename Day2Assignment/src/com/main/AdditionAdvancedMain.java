package com.main;
import java.util.Scanner;

import com.pojo.AdditionAdvanced;
/**
 * 
 * @author MokaSaiSuryaPrakash
 *
 * This program prints the sum of the numbers passed to the function addition in a pattern. 
 */
public class AdditionAdvancedMain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		AdditionAdvanced additionAdavnced=null;
		
		int[] inputArray;
		int arraySize;
		
		System.out.println("Enter the size of the array");
		arraySize=scanner.nextInt();
		System.out.println("Enter the elements");
		
		inputArray=new int[arraySize];
		
		for(int i=0;i<arraySize;i++)
		{
			inputArray[i]=scanner.nextInt();
		}
		
		additionAdavnced=new AdditionAdvanced();
		additionAdavnced.printSum(inputArray);
		
		additionAdavnced=null;
		scanner.close();
	}

}
