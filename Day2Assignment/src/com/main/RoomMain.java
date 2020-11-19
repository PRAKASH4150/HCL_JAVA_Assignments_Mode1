package com.main;
import java.util.Scanner;

import com.pojo.Room;
/**
 * 
 * @author MokaSaiSuryaPrakash
 *
 * This program demonstrates how we should assign the values to the private members of the class and how to access them
 */
public class RoomMain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		Room room=null;
		
		int roomNo;
		String roomType;
		double roomArea;
		String acMachine;
		
		System.out.println("Enter the Room Number:");
		roomNo=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the Room Type:");
		roomType=scanner.nextLine();
		
		System.out.println("Enter the Room Area:");
		roomArea=scanner.nextDouble();
		roomType=scanner.nextLine();
		
		System.out.println("Enter the AC Machine availability(Yes/No):");
		acMachine=scanner.nextLine();
		
		room=new Room();
		
		room.setData(roomNo, roomType, roomArea, acMachine);
		room.displayData();
		
		room=null;
		scanner.close();
		
	}

}
