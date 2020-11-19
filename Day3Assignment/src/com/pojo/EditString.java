package com.pojo;

public class EditString {

	private static String reversedString;
	private static int reversedStringLength;
	private static int outputStringLength;
	private static char[] outputChar;

	public static String reshape(String inputString, char seperator) {

		StringBuffer input = new StringBuffer(inputString);
		input = input.reverse();

		reversedString = input.toString();
		reversedStringLength = reversedString.length();

		outputStringLength = (reversedStringLength + reversedStringLength) - 1;

		outputChar = new char[outputStringLength];

		for (int i = 0; i < outputStringLength; i = i + 2) {
			if (i == 0) {
				outputChar[i] = reversedString.charAt(i);
			} else {
				outputChar[i] = reversedString.charAt(i / 2);
			}
		}

		for (int i = 1; i < outputStringLength; i = i + 2) {
			outputChar[i] = seperator;
		}
		return (String.valueOf(outputChar));
	}
}
