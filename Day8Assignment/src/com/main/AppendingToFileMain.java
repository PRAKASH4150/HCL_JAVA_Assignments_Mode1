package com.main;

import java.util.Scanner;

import com.service.AppendingToFile;
/**
 * 
 * @author Hi
 *Java program to append text to an existing file.
 */
public class AppendingToFileMain {

	public static void main(String[] args) {
		
		String appendContent;
		AppendingToFile appendToFile=null;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Content you want to append to the file");
		appendContent=scanner.nextLine();
		
		appendToFile=new AppendingToFile();
		appendToFile.append(appendContent);
		
		appendToFile=null;
		scanner.close();
		
	}

}
