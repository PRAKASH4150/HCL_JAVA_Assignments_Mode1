package com.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateComparision {

	public static String findOldDate(String date1, String date2) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY");
		Date dt1=null;
		Date dt2=null;

		try {
			 dt1 = simpleDateFormat.parse(date1);
			 dt2 = simpleDateFormat.parse(date2);
 
      		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		if (dt1.compareTo(dt2) > 0) {
			return date1;
		} else if (dt1.compareTo(dt2) < 0) {
			return date2;
		} else {
			return "equal";
		}

	}

}
