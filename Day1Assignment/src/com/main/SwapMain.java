package com.main;
import java.util.Scanner;

import com.pojo.Swap;
/**
 * 
 * @author MokaSaiSuryaPrakash
 *
 *This program is used two swap the two values as given by the user
 */

public class SwapMain {

	public static void main(String[] args) {
	
		int num1;
		int num2;
		
		Scanner scanner=new Scanner(System.in);
		Swap swap=null;
		
		System.out.println("Enter the first number:");
		num1=scanner.nextInt();
		
		System.out.println("Enter the second number:");
		num2=scanner.nextInt();
		
		swap=new Swap();
		swap.swapNumbers(num1,num2);
		
		swap=null;
		scanner.close();

	}

}
