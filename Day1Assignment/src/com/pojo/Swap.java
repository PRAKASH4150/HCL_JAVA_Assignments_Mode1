package com.pojo;

public class Swap {
	
	public void swapNumbers(int number1, int number2) {
		int temp;
		
		System.out.println("Numbers befor swapping are "+number1+" and "+number2);
		
		temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.println("Numbers after swapping are  " + number1 + "  and  " + number2);

	}
}
