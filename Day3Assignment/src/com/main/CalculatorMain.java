package com.main;
import java.util.Scanner;
import com.hcl.Calculator;
public class CalculatorMain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		Calculator calculator=null;
		
		int num1;
		int num2;
		int result;
		
		System.out.println("Enter the value of num1");
		num1=scanner.nextInt();
		System.out.println("Enter the value of num2");
		num2=scanner.nextInt();
		
		calculator=new Calculator();
		result=calculator.add(num1, num2);
		System.out.println(num1+" + "+num2+" = "+result);
		
		calculator=null;
		scanner.close();
	}

}
