package com.main;

import java.util.Scanner;

import com.service.IPAddress;
/**
 *  @author MokaSaiSuryaPrakash
 *  
 *  Program to read a string and validate the IP address. Print “Valid” if the IP address is valid, else print “Invalid”. 
 *  An IP address has the format a.b.c.d where a,b,c,d are numbers between 0-255. 
 *
 */
public class IPAddressMain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String inputIP;
		String result;
		
		System.out.println("Enter the IP Address:");
		inputIP=scanner.nextLine();
		
		result=IPAddress.ipValidator(inputIP);
		
		System.out.println("The IP Address "+inputIP+" is "+result);
		
		scanner.close();
		
	}
}
