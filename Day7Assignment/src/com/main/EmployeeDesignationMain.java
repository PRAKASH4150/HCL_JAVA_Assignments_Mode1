package com.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.service.EmployeeDesignation;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * 
 * Read Employee details from the User. The details would include name and designaton in the given order. 
 * The datatype for name and designation is string. Build a hashmap which contains the name as key and designation as value.
 * You decide to write a function obtainDesignation which takes the hashmap and designation as input and returns a string array of 
 * employee names who belong to that designation as output. Include this function in class UserMainCode.
 * Create a Class Main which would be used to read employee details in step 1 and build the hashmap.
 *  Call the static method present in UserMainCode.
 *
 */
public class EmployeeDesignationMain {

	public static void main(String[] args) {
		
		int numEmployees;
		String empName;
		String empDesignation;
		String requiredDesignation;
		Map<String,String> empDetails=null;
		List<String> empOutputList=null;
		
		EmployeeDesignation employeeDesignation=null;
	
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of employees");
		numEmployees=scanner.nextInt();
		
		
		empDetails=new HashMap<String,String>();
		for(int i=0;i<numEmployees;i++)
		{
			System.out.println("Enter the Employee Name:");
			empName=scanner.nextLine();
			scanner.nextLine();
		
			
			System.out.println("Enter the Employee designation");
			empDesignation=scanner.nextLine();
			
			empDetails.put(empName,empDesignation);
		}
		
		System.out.println("Enter the type of designation you want to search for:");
		requiredDesignation=scanner.nextLine();
		
		employeeDesignation=new EmployeeDesignation();
		empOutputList=employeeDesignation.obtainDesignation(empDetails,requiredDesignation);
		
		for(String name: empOutputList)
		{
			System.out.println("Name:"+name);
		}
		
		empDetails=null;
		empOutputList=null;
		employeeDesignation=null;
		scanner.close();
	}

}
