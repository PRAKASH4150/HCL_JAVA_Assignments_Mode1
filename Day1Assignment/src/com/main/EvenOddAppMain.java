package com.main;

import java.util.Scanner;

import com.pojo.EvenOddApp;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * 
 * This program is used to find the sum of the odd digits present in a number given by the user
 *
 */
public class EvenOddAppMain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int num;
		int result;
		
		System.out.println("Enter a number");
		num= scanner.nextInt();
       
		result=EvenOddApp.checkSum(num);
		
		if(result==1)
		{
			System.out.println("The sum of odd digits in the number "+num+" is odd");
		}
		
		else if(result==-1)
		{
			System.out.println("The sum of odd digits in the number "+num+" is even");
		}
		
		
	}

}
