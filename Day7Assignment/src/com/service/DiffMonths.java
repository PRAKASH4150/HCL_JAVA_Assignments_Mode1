package com.service;
import java.time.LocalDate;
import java.time.Period;

public class DiffMonths {

	private int numYears;
	private int numMonths;
	public int getMonthDifference(String presentDate,String pastDate)
	{
		
			LocalDate presDate= LocalDate.parse(presentDate);
			LocalDate pasDate= LocalDate.parse(pastDate);
			
			Period difference=Period.between(pasDate,presDate);			
			
			numYears=difference.getYears();
			numMonths=difference.getMonths();
			
			if(numYears>0)
			{
				numMonths=(numYears*12)+numMonths;
			}
			
			presDate=null;
			pasDate=null;
			return(numMonths);
	
	}
}
