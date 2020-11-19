package com.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.applicationexceptions.UserDefinedException;
import com.pojo.MyCalculator;
/**
 * 
 * @author MokaSaiSuryaPrakash
 *
 *This program gives an exception when base and power are zero or when either of base or power is negative.
 * Under normal condition the program returns the power of a given number
 */
public class UserDefinedExceptionMain {

	public static void main(String[] args) {

		int base;
		int power;
		long result;
		
		Scanner scanner=new Scanner(System.in);
		MyCalculator myCalculator=null;
		myCalculator=new MyCalculator();
		
		try {
			
		    System.out.println("Enter the base");
		    base=scanner.nextInt();
		    System.out.println("Enter the power");
		    power=scanner.nextInt();
		    
			result=myCalculator.power(base, power);
			System.out.println(base+"^"+power+"="+result);

		    }
		catch (UserDefinedException e1) {
			
			System.err.println(e1.getErrorMessage());
		}
		catch(InputMismatchException e2)
		{
			System.err.println("Input type is incompatible");
		}
		
		myCalculator=null;
		scanner.close();
	}

}
