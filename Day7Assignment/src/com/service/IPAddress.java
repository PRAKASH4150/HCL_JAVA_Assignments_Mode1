package com.service;

public class IPAddress {

	private static String[] ipBreakDown;
	private static int flag=0;
	
	public static String ipValidator(String ipAddress)
	{
		ipBreakDown=ipAddress.split("\\.");
		
		for(int i=0;i<ipBreakDown.length;i++)
		{
			if((Integer.parseInt(ipBreakDown[i])>255) || (Integer.parseInt(ipBreakDown[i])<0) )
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			return "not valid";
		}
		else
		{
			return "valid";
		}
	}
}
