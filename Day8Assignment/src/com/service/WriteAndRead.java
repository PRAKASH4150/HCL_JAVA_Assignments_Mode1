package com.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteAndRead {

	private byte[] byteArr;
	private int  outputContent;
	
	public void performWriteAndRead(String inputContent) {

		try {
			FileOutputStream writeData = new FileOutputStream("C:\\Users\\Hi\\Desktop\\HCL\\online_training_HCL\\Files\\Test2.txt");
			
			byteArr = inputContent.getBytes();
			writeData.write(byteArr);

			FileInputStream readData = new FileInputStream("C:\\\\Users\\\\Hi\\\\Desktop\\\\HCL\\\\online_training_HCL\\\\Files\\\\Test2.txt");
            
			while((outputContent=readData.read())!=-1)
			{
				System.out.print((char)outputContent);
			}
			
			writeData.close();
			readData.close();
		    } 
		catch (FileNotFoundException e)
		{

			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
	}
}
