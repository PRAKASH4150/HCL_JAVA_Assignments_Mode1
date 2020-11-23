package com.service;

import java.time.YearMonth;

public class TotalNumDays {

	private String[] monthArray= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	private int monthIndex;
	private int daysInMonth;
	
	public int getTotalNumberofDays(String month,int year)
	{
		YearMonth yearMonth=null;
		
		for(int i=0; i<monthArray.length;i++)
		{
			if(monthArray[i].equalsIgnoreCase(month))
			{
				monthIndex=i+1;
				break;
			}
		}
		
		yearMonth=YearMonth.of(year,monthIndex);
		daysInMonth=yearMonth.lengthOfMonth();
		
		return daysInMonth;
	}
}
