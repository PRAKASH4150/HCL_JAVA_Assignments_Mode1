package com.pojo;

public class Panagram {

	private boolean[] alphaArray = new boolean[26];
	private int index;
	private int flag = 1;

	public boolean checkIfPanagram(String input) {
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
				index = input.charAt(i) - 'a';
			} else if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
				index = input.charAt(i) - 'A';
			}

			alphaArray[index] = true;
		}

		for (int i = 0; i < alphaArray.length; i++) {
			if (alphaArray[i] == false) {
				flag = 0;
				break;
			}
		}

		if (flag == 1) {
			return true;
		} else {
			return false;
		}
	}
}
