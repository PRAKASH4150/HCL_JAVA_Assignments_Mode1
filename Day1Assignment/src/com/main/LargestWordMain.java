package com.main;
import java.util.Scanner;
/**
 * @author MokaSaiSuryaPrakash
 * This program is used to find the largest word in a given sentence
 */

import com.pojo.LargestWord;
public class LargestWordMain {

	public static void main(String[] args) {
		
		String sentence;
		String longestWord;
		
		Scanner scanner=new Scanner(System.in);

		
		System.out.println("Enter a sentence");
		sentence= scanner.nextLine();
		
		
		longestWord=LargestWord.getLargestWord(sentence);
		
		System.out.println("The longest word in the sentence \""+sentence+"\" is :"+longestWord);

		scanner.close();
	}

}
