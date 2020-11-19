package com.main;

import java.util.Scanner;

import com.pojo.PrimeNumberApp;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * 
 * This program is used to check whether a number entered by the user is Prime or Composite
 *
 */
public class PrimeNumberMain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		PrimeNumberApp primeNumber=null;
		
		int number;
		int result;
		
		System.out.println("Enter a number:");
		number=scanner.nextInt();
		
		primeNumber=new PrimeNumberApp();
		result=primeNumber.checkPrimeOrComposite(number);
		
		if(result==-1)
		{
			System.out.println(number+" is Niether Prime nor Composite");
		}
		
		else if(result==1)
		{
			System.out.println(number+" is a prime number");
		}
		else
		{
			System.out.println(number+" is a composite number");
		}
		
		primeNumber=null;
		scanner.close();

	}

}
