package com.main;

import java.util.Scanner;

import com.pojo.MyCalculator;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * 
 * This program is used to find the divisor sum of a number using the concept of interfaces
 *
 */
public class AdvancedArithmeticMain {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		
		MyCalculator myCalculator=new MyCalculator();
		
		int number;
		int result;
		
		System.out.println("Enter a number");
		number=scanner.nextInt();
		
		result=myCalculator.divisor_sum(number);
		System.out.println("The divisor sum of "+number+" is:"+result);
		
		myCalculator=null;
		scanner.close();

	}

}
