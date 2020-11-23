package com.main;

import java.util.Scanner;

import com.service.DateFormat;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * 
 * Given a date string in the format dd/mm/yyyy, write a program to convert the given date to the format dd-mm-yy. 
 *
 */
public class DateFormatMain {

	public static void main(String[] args) {
		
		String inputDate;
		String outputDate;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Date (dd/MM/yyyy)");
		inputDate=scanner.nextLine();
		
		outputDate=DateFormat.convertDateFormat(inputDate);
		
		System.out.println("Output Date:"+outputDate);
		
		scanner.close();

	}

}
