package com.pojo;

public class Rectangle extends Shape{
	
	private int length;
	private int breadth;
	
	public Rectangle(String name,int length,int breadth)
	{
		super(name);
		this.length=length;
		this.breadth=breadth;
	}
	
	public float calculateArea()
	{
		return(length*breadth);
	}

}
