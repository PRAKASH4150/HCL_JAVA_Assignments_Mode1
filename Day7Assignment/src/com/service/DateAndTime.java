package com.service;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * 
 * This is a java program to print the current date and Time in a specified format
 *
 */
public class DateAndTime {

	private String formatedDate;
	private String formatedTime;
	
	public String[] getDateTime(String dateFormat,String timeFormat)
	{
		Date date=new Date();
		
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat(dateFormat);
		SimpleDateFormat simpleTimeFormat=new SimpleDateFormat(timeFormat);
		String[] formatedResults=null;
		
		formatedDate=simpleDateFormat.format(date);
		formatedTime=simpleTimeFormat.format(date);
		
		formatedResults=new String[2];
		
		formatedResults[0]=formatedDate;
		formatedResults[1]=formatedTime;
		
		simpleDateFormat=null;
		simpleTimeFormat=null;
		date=null;
		
		return(formatedResults);
	}
}
