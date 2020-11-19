package com.main;
import java.util.Scanner;

import com.pojo.ArraySorting;
/**
 * 
 * @author MokaSaiSuryaPrakash
 *
 * This program sorts an integer array of 10 elements in ascending order
 */
public class ArraySortingMain {

	public static void main(String[] args) {
		
		int[] inputArray;
		int[] outputArray;
		int arraySize;
		
		Scanner scanner=new Scanner(System.in);
		ArraySorting arraySorting=null;
		
		System.out.println("Enter the size of the array:");
		arraySize=scanner.nextInt();
		inputArray=new int[arraySize];
		
		System.out.println("Enter the elements:");
		
		for(int i=0;i<arraySize;i++)
		{
			inputArray[i]=scanner.nextInt();
		}
		
		arraySorting=new ArraySorting();
		
		outputArray=arraySorting.sortArray(inputArray);
		
		
		for(int i=0;i<arraySize;i++)
		{
			System.out.println(outputArray[i]);
		}
		
		inputArray=null;
		outputArray=null;
		arraySorting=null;
		scanner.close();
	}

}
