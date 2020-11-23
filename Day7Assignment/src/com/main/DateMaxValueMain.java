package com.main;

import com.service.DateMaxValue;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * Java program to get the maximum value of the year, month, week, date from the current date of a default calendar
 *
 */
public class DateMaxValueMain {

	public static void main(String[] args) {

		int[] outputValues=new int[4];
		DateMaxValue dateMaxValue=new DateMaxValue();
		outputValues=dateMaxValue.getMaxVal();
		
		System.out.println("Actual Maximum Year: "+outputValues[0]);
		System.out.println("Actual Maximum Month: "+outputValues[1]);
		System.out.println("Actual Maximum Week of Year: "+outputValues[2]);
		System.out.println("Actual Maximum Date: "+outputValues[3]);

	}

}
