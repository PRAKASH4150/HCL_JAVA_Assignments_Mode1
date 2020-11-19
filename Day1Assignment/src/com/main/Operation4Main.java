package com.main;

import java.util.Scanner;

import com.pojo.Operation4;
/**
 * 
 * @author MokaSaiSuryaPrakash
 *
 *This program performs Arithmetic Operations
 */
public class Operation4Main {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		int num6;
		int result;

		Scanner scanner = new Scanner(System.in);
		Operation4 operation4 = null;

		System.out.println("Enter 1st Number:");
		num1 = scanner.nextInt();

		System.out.println("Enter 2nd Number:");
		num2 = scanner.nextInt();

		System.out.println("Enter 3rd Number:");
		num3 = scanner.nextInt();

		System.out.println("Enter 4th Number:");
		num4 = scanner.nextInt();

		System.out.println("Enter 5th Number:");
		num5 = scanner.nextInt();

		System.out.println("Enter 6th Number:");
		num6 = scanner.nextInt();

		operation4 = new Operation4();

		result = operation4.getResult(num1, num2, num3, num4, num5, num6);

		System.out.println(num1+"+"+num2+"/"+num3+"*"+num4+"-"+num5+"%"+num6+"="+result);

		operation4 = null;
		scanner.close();

	}

}
