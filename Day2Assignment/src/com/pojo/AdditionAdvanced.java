package com.pojo;

public class AdditionAdvanced {

	private int sum = 0;
	private int i = 0;
	private int j = 0;
	private int arraySize;

	public void printSum(int[] array) {
		arraySize = array.length;

		while (j < arraySize) {
			j = j + 1;
			if (j > 1) {
				for (int k = i; k < j; k++) {
					sum = sum + array[k];
					if(k!=j-1)
					{
						System.out.print(array[k] + "+");
					}
					else
					{
						System.out.print(array[k]);
					}
					
				}
				System.out.println("=" + sum);
				sum = 0;
			}

		}
	}
}
