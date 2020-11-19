package com.main;
import java.util.Scanner;

import com.pojo.CharacterReplacing;
/**
 *
 * @author MokaSaiSuryaPrakash
 *
 *This program replaces all the 'd' occurrence characters with ‘h’ characters in each string.
 */
public class characterReplacingMain {

	public static void main(String[] args) {

		String inputWord;
		String outputResult;
		
		CharacterReplacing characterReplacing=null;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a value");
		inputWord=scanner.nextLine();
		
		
		characterReplacing=new CharacterReplacing();
		
		outputResult=characterReplacing.replaceCharacter(inputWord);
		
		System.out.println(outputResult);
		
		characterReplacing=null;
		scanner.close();
		
		
	}

}
