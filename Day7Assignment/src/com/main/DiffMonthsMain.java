package com.main;

import java.util.Scanner;

import com.service.DiffMonths;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * Given a method with two date strings in yyyy-mm-dd format as input. 
 * Write code to find the difference between two dates in months
 *
 */
public class DiffMonthsMain {

	public static void main(String[] args) {
	
		String presentDate;
		String pastDate;
		int numMonths;
		DiffMonths diffMonths=null;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the present date (yyyy-MM--dd)");
		presentDate=scanner.nextLine();
		
		System.out.println("Enter the past date (yyyy-MM--dd)");
		pastDate=scanner.nextLine();
		
		diffMonths=new DiffMonths();
		numMonths=diffMonths.getMonthDifference(presentDate, pastDate);
		
		System.out.println("The difference in Months between "+pastDate+" and "+presentDate+" is "+numMonths+" months");
		
		diffMonths=null;
		scanner.close();
	}

}
