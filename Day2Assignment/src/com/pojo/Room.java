package com.pojo;

public class Room {
		
	private int roomNo;
	private String roomType;
	private double roomArea;
	private String acMachine;
	
	public void setData(int roomNo,String roomType,double roomArea,String acMachine)
	{
		this.roomNo=roomNo;
		this.roomType=roomType;
		this.roomArea=roomArea;
		this.acMachine=acMachine;
		
	}
	
	public void displayData()
	{
		System.out.println("Room Number:"+this.roomNo);
		System.out.println("Room Type:"+this.roomType);
		System.out.println("Room Area:"+this.roomArea);
		System.out.println("Ac Machine Availability:"+this.acMachine);
	}

}
