package com.main;

import java.util.Scanner;

import com.service.DateComparision;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * 
 * program to read  two String variables in DD-MM-YYYY.Compare the two dates and return the older date in 'MM/DD/YYYY' format. 
 *
 */
public class DateComparisonMain {

	public static void main(String[] args) {
		
		String date1;
		String date2;
		String resultDate;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a Date (eg:dd/MM/yyyy)");
		date1=scanner.nextLine();
		
		System.out.println("Enter a Date (eg:dd/MM/yyyy)");
		date2=scanner.nextLine();
		
		resultDate=DateComparision.findOldDate(date1, date2);
		
		if(resultDate.equals("equal"))
		{
			System.out.println("Both dates are equal");
		}
		else
		{
			System.out.println(resultDate+" is the largest Date");
		}
		
		scanner.close();
	}

	
}
