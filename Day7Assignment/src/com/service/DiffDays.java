package com.service;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class DiffDays {

	private long numDays;
	public long getDateDifference(String present,String past)
	{
		try
		{
		LocalDate dateBefore=LocalDate.parse(past);
		LocalDate dateAfter=LocalDate.parse(present);
		
		numDays=ChronoUnit.DAYS.between(dateBefore,dateAfter);
		
		dateBefore=null;
		dateAfter=null;
		
		return numDays;
		
		}
		catch(DateTimeParseException e)
		{
			System.err.println("Invalid Date Format!!!");
		}
		return -1;
	}
}
