package com.main;

import java.util.Scanner;

import com.service.ExtractDateTime;

public class ExtractDateTimeMain {

	public static void main(String[] args) {
		
		String inputDate;
		String outputDate;
		Scanner scanner=new Scanner(System.in);
		ExtractDateTime extractDateTime=null;
		
		System.out.println("Enter the date & time (dd/MM/YYYY HH:mm:ss)");
		inputDate=scanner.nextLine();
		
		extractDateTime=new ExtractDateTime();
		
		outputDate=extractDateTime.extractDateTime(inputDate);
		
		System.out.println("Date & Time:"+outputDate);
		
		scanner.close();
		extractDateTime=null;
	}
}
