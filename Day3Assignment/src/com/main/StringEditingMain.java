package com.main;
import java.util.Scanner;
import com.pojo.StringEditing;
/**
 * 
 * @author MokaSaiSuryaPrakash
 *
 * This program reads a string and return a modified string based on the following rules.
   Return the String without the first 2 characters except when
            a. Keep the first char if it is 'k'
            b. Keep the second char if it is 'b'.
 */
public class StringEditingMain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		
		String inputString;
		String outputString;
		
		System.out.println("Enter the input String");
		inputString=scanner.nextLine();
		
		outputString=StringEditing.getString(inputString);
		
		System.out.println(outputString);
		scanner.close();
		inputString=null;
		outputString=null;
	}

}
