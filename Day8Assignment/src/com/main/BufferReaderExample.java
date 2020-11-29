package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * 
 *  Java program by using BufferedReader class to prompt a user to input his/her name 
 *  and then the output will be shown as an example below:
 *  
 */
public class BufferReaderExample {

	public static void main(String[] args) {

		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferReader = new BufferedReader(inputStreamReader);
		String name;
		
		System.out.println("Enter your name:");
		try {
			name=bufferReader.readLine();
			System.out.println("Welcome "+name);
		    } catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
