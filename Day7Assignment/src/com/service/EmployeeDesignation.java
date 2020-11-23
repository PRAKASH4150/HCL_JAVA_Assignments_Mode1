package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmployeeDesignation {

	public List<String> obtainDesignation(Map<String,String> employeeDetails,String designation)
	{
		List<String> empList=new ArrayList<String>();
		
		for(Map.Entry<String, String> details: employeeDetails.entrySet())
		{
			if(details.getValue().equals(designation))
			{
				empList.add(details.getKey());
			}
		}
		return empList;

	}
}
