package com.main;

import java.util.Scanner;

import com.service.TotalNumDays;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * 
 * Given two inputs year and month (Month is coded as: Jan=0, Feb=1 ,Mar=2 ...), 
 * This program is used to find out total number of days in the given month for the given year.
 *
 */
public class TotalNumDaysMain {

	public static void main(String[] args) {
		
		int totalNumDaysInMonth;
		int year;
	    String month;
		TotalNumDays totalNumDays=null;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the year (Eg: 2020)");
		year=scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter the first 3 letters of the month (Eg: Mar)");
		month=scanner.nextLine();
		
		totalNumDays=new TotalNumDays();
		totalNumDaysInMonth=totalNumDays.getTotalNumberofDays(month,year);
		
		System.out.println("Total Number of Days in the month "+month+" of year "+year+" is:"+totalNumDaysInMonth);
		
		totalNumDays=null;
		scanner.close();
		
	}
}
