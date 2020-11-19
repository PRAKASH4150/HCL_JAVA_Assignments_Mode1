package com.main;

import java.util.Scanner;

import com.pojo.Operation1;
/**
 * 
 * @author MokaSaiSuryaPrakash
 *
 *This program performs Arithmetic Operations
 */
public class Operation1Main {

	public static void main(String[] args) {

		int num1;
		int num2;
		int num3;
		int result;
		
		Scanner scanner=new Scanner(System.in);
		Operation1 operation1=null;
		
		System.out.println("Enter 1st Number:");
		num1=scanner.nextInt();
		
		System.out.println("Enter 2nd Number:");
		num2=scanner.nextInt();
		
		System.out.println("Enter 3rd Number:");
		num3=scanner.nextInt();
		
		operation1=new Operation1();
		
		result=operation1.getResult(num1, num2, num3);
		
		System.out.println("-"+num1+"+"+num2+"*"+num3+"="+result);
		
		operation1=null;
		scanner.close();
		
		}

}
