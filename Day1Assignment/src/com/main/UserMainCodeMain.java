package com.main;

import java.util.Scanner;

import com.pojo.UserMainCode;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * 
 * This Program is used to calculate the sum of the squares of even digits present in a given number
 *
 */
public class UserMainCodeMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int input;
		int result;

		System.out.println("Enter a number");
		input = scanner.nextInt();

		result = UserMainCode.sumOfSquaresOfEvenDigits(input);
		System.out.println("The Sum of Squares of Even digits in the number " + input + " is " + result);

		scanner.close();
	}

}
