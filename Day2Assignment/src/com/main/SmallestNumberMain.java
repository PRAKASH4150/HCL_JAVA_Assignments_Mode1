package com.main;
import java.util.Scanner;

import com.pojo.SmallestNumber;
/**
 * 
 * @author MokaSaiSuryaPrakash
 *
 *This program is used to find the smallest among the three numbers
 */
public class SmallestNumberMain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		SmallestNumber smallestNumber=null;
		
		int num1;
		int num2;
		int num3;
		int result;
		
		System.out.println("Enter the fist value:");
		num1=scanner.nextInt();
		
		System.out.println("Enter the second value:");
		num2=scanner.nextInt();
		
		System.out.println("Enter the third value");
		num3=scanner.nextInt();
		
		smallestNumber=new SmallestNumber();
		
		result=smallestNumber.checkSmallestNumber(num1, num2, num3);
		
		System.out.println(result+" is the smallest number");
		
		smallestNumber=null;
		scanner.close();
	}
}
