package com.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AppendingToFile {

	private String path;
	private int contentBefore;
	private int contentAfter;
	public void append(String appendContent)
	{
		path="C:\\Users\\Hi\\Desktop\\HCL\\online_training_HCL\\Files\\Append.txt";
		
		try {
			FileInputStream fileInputStream=new FileInputStream(path);
			
			System.out.println("Content Before:");
			while((contentBefore=fileInputStream.read())!=-1)
			{
				System.out.print((char)contentBefore);
			}
			Files.write(Paths.get(path),appendContent.getBytes(),StandardOpenOption.APPEND);

			System.out.println();
			System.out.println("Content After:");
			while((contentAfter=fileInputStream.read())!=-1)
			{
			  	System.out.print((char)contentAfter);
			}
			
			fileInputStream.close();
		    }
		catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
