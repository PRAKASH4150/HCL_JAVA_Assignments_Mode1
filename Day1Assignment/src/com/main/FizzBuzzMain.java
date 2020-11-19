package com.main;
import java.util.Scanner;

import com.pojo.FizzBuzzApplication;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * 
 * This program iterates over a series of array elements. For multiples of three it prints "Fizz" instead of the number
 *  and prints "Buzz" for the multiples of five. When number is divided by both three and five, it prints "fizz buzz".
 *
 */
public class FizzBuzzMain {

	public static void main(String[] args) {
			
		FizzBuzzApplication fizzBuzzApp=null;
		Scanner scanner=new Scanner(System.in);
		
		int arraySize;
		String [] resultSet;
		
		System.out.println("Enter the Array Size");
		arraySize=scanner.nextInt();
		
		fizzBuzzApp=new FizzBuzzApplication();
		resultSet=fizzBuzzApp.checkFizzandBuzz(arraySize);
		
		for(int i=0;i<arraySize;i++)
		{
			System.out.println(resultSet[i]);
		}
		
		fizzBuzzApp=null;
		scanner.close();

	}

}
