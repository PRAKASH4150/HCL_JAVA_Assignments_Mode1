package com.main;

import java.util.Scanner;

import com.service.MyThread;

/**
 * 
 * @author MokaSaiSuryaPrakash
 * 		   Write a program to assign the current thread to
 *         t1. Change the name of the thread to MyThread. Display the changed
 *         name of the thread. Also it should display the current time. Put the
 *         thread to sleep for 10 seconds and display the time again.
 *
 */
public class MyThreadMain {

	public static void main(String[] args) {

		MyThread t1 = null;
		Scanner scanner = new Scanner(System.in);
		String threadName;

		System.out.println("Enter the thread Name");
		threadName = scanner.nextLine();

		t1 = new MyThread();
		t1.setName(threadName);
		t1.start();

		scanner.close();
		t1 = null;
	}
}
