package com.main;

import java.util.Scanner;
import com.pojo.Operation3;
/**
 * 
 * @author MokaSaiSuryaPrakash
 *
 *This program performs Arithmetic Operations
 */
public class Operation3Main {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int num3;
		int num4;
		int result;
		
		Scanner scanner=new Scanner(System.in);
		Operation3 operation3=null;
		
		System.out.println("Enter 1st Number:");
		num1=scanner.nextInt();
		
		System.out.println("Enter 2nd Number:");
		num2=scanner.nextInt();
		
		System.out.println("Enter 3rd Number:");
		num3=scanner.nextInt();
		
		System.out.println("Enter 4th Number:");
		num4=scanner.nextInt();
		
		operation3=new Operation3();
		
		result=operation3.getResult(num1, num2, num3,num4);
		
		System.out.println(num1+"-"+num2+"*"+num3+"/"+num4+"="+result);
		
		operation3=null;
		scanner.close();
	}

}
