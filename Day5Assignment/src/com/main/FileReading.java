package com.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 
 * @author MokaSaiSuryaPrakash
 *
 *This program demonstrates the exception handling in files
 */
public class FileReading {
	public static void main(String[] args) {
		InputStream istream;
		OutputStream ostream;
		int c;
		final int EOF = -1;
		ostream = System.out;
		try {
			File inputFile = new File("C:\\demo.txt");
			istream = new FileInputStream(inputFile);
			try {
				while ((c = istream.read()) != EOF)
					ostream.write(c);
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			} finally {
				try {
					istream.close();
					ostream.close();
				} catch (IOException e) {
					System.out.println("File did not close");
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}
