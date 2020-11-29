package com.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import com.service.WriteAndRead;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * Java program to write and read a plain text file.
 *
 */
public class WriteAndReadMain {

	public static void main(String[] args) {

		String inputContent;
		
		WriteAndRead writeAndRead=null;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the input content of the file");
		inputContent=scanner.nextLine();
		
		writeAndRead=new WriteAndRead();
		writeAndRead.performWriteAndRead(inputContent);
		scanner.close();
		writeAndRead=null;
	}

}
