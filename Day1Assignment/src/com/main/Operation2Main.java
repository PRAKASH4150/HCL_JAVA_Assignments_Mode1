package com.main;

import java.util.Scanner;
/**
 * 
 * @author MokaSaiSuryaPrakash
 *
 *This program performs Arithmetic Operations
 */

import com.pojo.Operation2;
public class Operation2Main {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int result;
		
		Scanner scanner=new Scanner(System.in);
		Operation2 operation2=null;
		
		System.out.println("Enter 1st Number:");
		num1=scanner.nextInt();
		
		System.out.println("Enter 2nd Number:");
		num2=scanner.nextInt();
		
		System.out.println("Enter 3rd Number:");
		num3=scanner.nextInt();
		
		operation2=new Operation2();
		
		result=operation2.getResult(num1, num2, num3);
		
		System.out.println("("+num1+"+"+num2+")%"+num3+"="+result);
		
		operation2=null;
		scanner.close();

	}

}
