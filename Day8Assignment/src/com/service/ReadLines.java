package com.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.UnsupportedEncodingException;

public class ReadLines {

	private String strLine;
	public void getRequiredLines(int numLines)
	{
		try {
			LineNumberReader reader=new LineNumberReader(
			new InputStreamReader(new FileInputStream("C:\\Users\\Hi\\Desktop\\HCL\\online_training_HCL\\Files\\GetLines.txt"),"UTF-8"));
			
			while((strLine=reader.readLine())!=null && (reader.getLineNumber()<=numLines))
			{
				System.out.println(strLine);
			}
		
			reader.close();
		    } 
		catch (UnsupportedEncodingException e) 
		{
			e.printStackTrace();
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	
		
	}
}
