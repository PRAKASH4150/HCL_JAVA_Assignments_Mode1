package com.main;

import java.util.Scanner;

import com.pojo.CalculatorApp;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * 
 * This program is developed in order to calculate the addition, subtraction, multiplication and division of any two numbers as 
 * given by the user.
 *
 */
public class CalculatorMain {

	public static void main(String[] args) {

		float num1;
		float num2;

		CalculatorApp calculator = null;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number:");
		num1 = scanner.nextInt();
		System.out.println("Enter the second number:");
		num2 = scanner.nextInt();

		calculator = new CalculatorApp();

		System.out.println("Addition of " + num1 + " and " + num2 + " is:" + calculator.addition(num1, num2));
		System.out.println("Subtraction of " + num1 + " and " + num2 + " is:" + calculator.subtraction(num1, num2));
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is:" + calculator.multiplication(num1, num2));
		System.out.println("Division of " + num1 + " and " + num2 + " is:" + calculator.division(num1, num2));
		System.out.println("Reaminder of " + num1 + " and" + num2 + " is:" + calculator.remainder(num1, num2));

		calculator = null;
		scanner.close();
	}

}
