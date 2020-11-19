package com.main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author MokaSaiSuryaPrakash
 * 
 * This program demonstrates the exception handling using try and catch block
 *
 */
public class ExceptionHandling {

	public static void main(String[] args) {

		int num1;
		int num2;
		int result;

		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter the Number 1");
			num1 = scanner.nextInt();

			System.out.println("Enter the Number 2");
			num2 = scanner.nextInt();

			result=(num1 / num2);
			System.out.println(num1 + "/" + num2 + "=" + result);
		    }
		catch (InputMismatchException e1) 
		{
			System.err.println("The input which you have entered is an incompatible type.");
			e1.printStackTrace();
		}
		catch(ArithmeticException e2)
		{
			System.err.println("Division by zero is not possible");
			e2.printStackTrace();
		}
		
		scanner.close();
	}
 
}
