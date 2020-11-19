package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**@author MokaSaiSuryaPrakash
 * 
 * This program calculates the run rate and raises exception for number format and arthmetic exception
 * 
 *
 */
public class RunRateCalculation {

	public static void main(String[] args) {

		int total_runs;
		int total_overs;
		double run_rate;
		

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Enter the total runs:");
			total_runs = Integer.parseInt(reader.readLine());

			System.out.println("Enter the total overs:");
			total_overs = Integer.parseInt(reader.readLine());

			run_rate=((double)total_runs)/total_overs;
			
			System.out.println("Current Run Rate:"+run_rate);
			
		} catch (NumberFormatException e) {
			System.err.println("The number you have entered is incompatible");
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch(ArithmeticException e2)
		{
			System.err.println("Division by zero is not possible");
			e2.printStackTrace();
		}
		
		reader=null;
	}

}
