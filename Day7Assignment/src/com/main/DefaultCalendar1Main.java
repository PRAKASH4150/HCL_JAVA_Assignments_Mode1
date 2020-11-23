package com.main;

import java.util.HashMap;
import java.util.Map;

import com.service.DefaultCalendar1;
/**
 * 
 * @author MokaSaiSuryaPrakash
 *
 *Java program to get and display information (year, month, day, hour, minute) of a default calendar 
 *
 */
public class DefaultCalendar1Main {

	public static void main(String[] args) {
		
	
		DefaultCalendar1 defaultCalendar1=new DefaultCalendar1();
		
		Map<String,Integer> resultMap=new HashMap<String,Integer>();
		
		resultMap=defaultCalendar1.displayInformation();
		
		for(Map.Entry<String,Integer> value: resultMap.entrySet())
		{
			System.out.println(value.getKey()+" : "+value.getValue());
		}
		
		defaultCalendar1=null;

	}

}
