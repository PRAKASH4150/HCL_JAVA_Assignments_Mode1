package com.pojo;

public class Circle extends Shape {

	private int radius;
	
	public Circle(String name, int radius)
	{
		super(name);
		this.radius=radius;
	}
	
	public float calculateArea()
	{
		return(3.14f*radius*radius);
	}
}
