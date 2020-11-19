package com.pojo;

public class Square extends Shape {
	
	private int side;
	
	public Square(String name,int side)
	{
		super(name);
		this.side=side;
	}
	
	public float calculateArea()
	{
		return(side*side);
	}

}
