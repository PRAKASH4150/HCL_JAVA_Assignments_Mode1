package com.pojo;

public abstract class Shape {

	protected String name;
	
	public Shape(String name)
	{
		this.name=name;
		System.out.println(this.name);
	}
	
	public abstract float calculateArea();
}
