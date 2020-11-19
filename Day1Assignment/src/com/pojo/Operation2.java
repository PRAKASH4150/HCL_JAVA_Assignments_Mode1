package com.pojo;

public class Operation2 {

private int result;
	
	public int getResult(int num1,int num2,int num3)
	{
		result=(num1+num2)%num3;
		return result;
	}
}
