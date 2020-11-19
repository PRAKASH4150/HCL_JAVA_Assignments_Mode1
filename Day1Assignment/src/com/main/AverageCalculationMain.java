package com.main;
import java.util.Scanner;

import com.pojo.AverageCalculation;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * 
 * This program is used to find the average of any 3 numbers as given by the user
 *
 */
public class AverageCalculationMain {

	public static void main(String[] args) {
		
		float num1;
		float num2;
		float num3;
		float average;
		
		Scanner scanner=new Scanner(System.in);
		AverageCalculation averageCalculation=null;
		
		System.out.println("Enter the first number");
		num1=scanner.nextInt();
		
		System.out.println("Enter the second number");
		num2=scanner.nextInt();
		
		System.out.println("Enter the third number");
		num3=scanner.nextInt();
		
		averageCalculation=new AverageCalculation();
		average=averageCalculation.calculateAverage(num1, num2, num3);
		
		System.out.println("Average of "+num1+","+num2+","+num3+" is:"+average);
		
		averageCalculation=null;
		scanner.close();
	}

}
