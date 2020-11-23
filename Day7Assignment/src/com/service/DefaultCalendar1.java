package com.service;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class DefaultCalendar1 {

	private Map<String,Integer> calendarMap;
	
	public Map<String,Integer> displayInformation()
	{
		Calendar calendar=Calendar.getInstance();
		
		calendarMap=new HashMap<String,Integer>();
		
		calendarMap.put("Year",calendar.get(Calendar.YEAR));
		calendarMap.put("Month",calendar.get(Calendar.MONTH));
		calendarMap.put("Day",calendar.get(Calendar.DATE));
		calendarMap.put("Hour",calendar.get(Calendar.HOUR));
		calendarMap.put("Minutes",calendar.get(Calendar.MINUTE));
		
		calendar=null;
		return calendarMap;
	}
}
