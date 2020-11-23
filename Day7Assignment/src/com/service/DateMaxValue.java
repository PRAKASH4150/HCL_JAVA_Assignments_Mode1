package com.service;

import java.util.Calendar;

public class DateMaxValue {

	private int[] maxValues;
	
	public int[] getMaxVal()
	{
		Calendar calendar=Calendar.getInstance();
		maxValues=new int[4];
		maxValues[0]=calendar.getActualMaximum(Calendar.YEAR);
		maxValues[1]=calendar.getActualMaximum(Calendar.MONTH);
		maxValues[2]=calendar.getActualMaximum(Calendar.WEEK_OF_YEAR);
		maxValues[3]=calendar.getActualMaximum(Calendar.DATE);
		
		return maxValues;
	}
}
