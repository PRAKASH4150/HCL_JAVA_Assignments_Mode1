package com.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountWordsMain {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\Hi\\Desktop\\HCL\\online_training_HCL\\Files\\FindWordPatten.txt");
		String[] words = null;
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		String s;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word : ");
		String input = sc.nextLine();
		int count = 0;
		while ((s = br.readLine()) != null) {
			words = s.split(" ");
			for (String word : words) {
				if (word.equals(input)) {
					count++;
				}
			}
		}
		if (count != 0) {
			System.out.println("The given word " + input +" is present for " + count + " Times in the file");
		} else {
			System.out.println("The given word is not present in the file");
		}

		fr.close();

	}

}
