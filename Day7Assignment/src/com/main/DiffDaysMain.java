package com.main;

import java.util.Scanner;

import com.service.DiffDays;

/**
 * 
 * @author MokaSaiSuryaPrakash
 * 
 *         Program to Get two date strings as input and write code to find
 *         difference between two dates in days.
 *
 */
public class DiffDaysMain {

	public static void main(String[] args) {

		DiffDays diffDays = null;
		String pastDate;
		String presentDate;
		long numDays;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the past date (yyyy-MM-dd):");
		pastDate = scanner.nextLine();
		System.out.println("Enter the present date (yyyy-MM-dd):");
		presentDate = scanner.nextLine();

		diffDays = new DiffDays();

		numDays = diffDays.getDateDifference(presentDate, pastDate);

		if (numDays >= 0) {
			System.out.println("Number of Days between " + pastDate + " and" + presentDate + " is: " + numDays);
		} else {
			System.out.println("Input Invalid");
		}
		diffDays = null;
		scanner.close();

	}

}
