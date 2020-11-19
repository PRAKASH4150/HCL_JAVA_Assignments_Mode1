package com.main;

import java.util.Scanner;
import com.pojo.SearchElement;
/**
 * 
 * @author MokaSaiSuryaPrakash
 *
 *This program is used to search for a particular element in the array
 */
public class SearchElementMain {

	public static void main(String[] args) {

		int[] inputArray=null;
		int arraySize;
		int requiredElement;
		int outputIndex;

		Scanner scanner = new Scanner(System.in);
		SearchElement searchElement = null;

		System.out.println("Enter the size of the array:");
		arraySize = scanner.nextInt();
		inputArray = new int[arraySize];
		
		System.out.println();
		System.out.println("Enter the elements:");

		for (int i = 0; i < arraySize; i++) {
			inputArray[i] = scanner.nextInt();
		}

		System.out.println("Enter the required element");
		requiredElement = scanner.nextInt();

		searchElement = new SearchElement();
        outputIndex=searchElement.searchforElement(inputArray,requiredElement);
        
        if(outputIndex!=-1)
        {
        	System.out.println("The element "+requiredElement+" is foud at the position "+outputIndex);
        }
        else
        {
        	System.out.println("Element not found");
        }
        
		inputArray = null;
		searchElement=null;
		scanner.close();

	}

}
