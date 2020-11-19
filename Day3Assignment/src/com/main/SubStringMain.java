package com.main;
import java.util.Scanner;

import com.pojo.SubString;
/**
 * 
 * @author This program is used to find the substring of the given string
 *
 */
public class SubStringMain extends Object {

	public static void main(String[] args) {
		
		String inputWord=null;
		String outputWord=null;
		int startingIndex;
		int endingIndex;
		
		Scanner scanner=new Scanner(System.in);
		SubString subString=null;
		
		System.out.println("Enter the Word");
		inputWord=scanner.nextLine();
		
		System.out.println("Enter the Starting Index");
		startingIndex=scanner.nextInt();
		
		System.out.println("Enter the ending Index");
		endingIndex=scanner.nextInt();
		
		subString=new SubString();
		
		outputWord=subString.getSubString(inputWord, startingIndex, endingIndex);
		System.out.println("The substring of "+inputWord+" is:"+outputWord);
		
		subString=null;
		inputWord=null;
		outputWord=null;
		scanner.close();
	}

}
