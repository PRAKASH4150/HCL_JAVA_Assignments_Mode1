package com.pojo;

public class EvenOddApp {

	private static int temp;
	private static int sum = 0;

	public static int checkSum(int num) {
		while (num != 0) {
			temp = num % 10;
			num = num / 10;

			if (temp % 2 != 0) {
				sum = sum + temp;
			} else {
				sum = sum;
			}

		}
		if (sum % 2 != 0) {
			return 1;
		} else if (sum == 0) {
			return -1;
		} else {
			return -1;
		}

	}
}
