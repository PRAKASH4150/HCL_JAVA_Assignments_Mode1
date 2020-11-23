package com.service;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateFormat {

	private static SimpleDateFormat simpleInputDateFormat=null;
	private static SimpleDateFormat simpleoutputDateFormat=null;
	private static String outputDate=null;
	
	public static String convertDateFormat(String userDate)
	{
		simpleInputDateFormat=new SimpleDateFormat("dd/MM/yyyy");
		simpleoutputDateFormat=new SimpleDateFormat("dd-MM-YYY");
		
		try {
			outputDate=simpleoutputDateFormat.format(simpleInputDateFormat.parse(userDate));
		    } 
		catch (ParseException e) {
		
			e.printStackTrace();
		}
		
		simpleoutputDateFormat=null;
		simpleInputDateFormat=null;
		
		return(outputDate);
	}
}
