package com.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtractDateTime {

	private String outputDate;
	
	public String extractDateTime(String inputDate)
	{
		SimpleDateFormat simpleInputDateFormat=new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		
		try {
			Date date= simpleInputDateFormat.parse(inputDate);
			outputDate=new SimpleDateFormat("dd/MM/YYYY, HH:mm:ss").format(date);
			
			date=null;
			simpleInputDateFormat=null;
		    }
		catch (ParseException e) 
		{
			e.printStackTrace();
		}
	
		return outputDate;
	}
}
