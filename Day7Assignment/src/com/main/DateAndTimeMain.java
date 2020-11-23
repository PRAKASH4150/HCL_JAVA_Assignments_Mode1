package com.main;

import java.util.Scanner;

import com.service.DateAndTime;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * 
 * This is a java program to print the current date and Time in a specified format
 *
 */
public class DateAndTimeMain {
	public static void main(String[] args) {
		
		String dateFormat;
		String timeFormat;
		String[] outputResult=null;
		
		DateAndTime dateAndTime=null;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the date format (Eg: dd/MM/yyy or MM/dd/yyyy)");
		dateFormat=scanner.nextLine();
		
		System.out.println("Enter the time format (Eg: hh:mm:ss or ss:mm:hh)");
		timeFormat=scanner.nextLine();
		
		dateAndTime=new DateAndTime();
		outputResult=dateAndTime.getDateTime(dateFormat, timeFormat);
		
		System.out.println("Date:"+outputResult[0]);
		System.out.println("Time:"+outputResult[1]);
		
		outputResult=null;
		dateAndTime=null;
		scanner.close();
	}
}
