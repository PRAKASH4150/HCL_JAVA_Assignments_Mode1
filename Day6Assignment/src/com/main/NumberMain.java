package com.main;

import com.service.Number;

/**
 * 
 * @author MokaSaiSuryaPrakash
 * 
 *         Program to create a class Number which implements Runnable. Run
 *         method displays the multiples of a number accepted as a parameter. In
 *         main create three objects-first object should display the multiples
 *         of 2, second display the multiples of 5 and third should display the
 *         multiples of 8. Display the appropriate message at the begining and
 *         ending of the thread.
 * 
 *
 */
public class NumberMain {

	public static void main(String[] args) {

		Number number1 = new Number(2);
		Number number2 = new Number(5);
		Number number3 = new Number(8);

		try {
			Thread thread1 = new Thread(number1);
			thread1.start();
			System.out.println("Thread1 Alive:" + thread1.isAlive());
			thread1.join();
			System.out.println("Thread1 Alive:" + thread1.isAlive());
			System.out.println("***************************");
			Thread thread2 = new Thread(number2);
			thread2.start();
			System.out.println("Thread2 Alive:" + thread2.isAlive());
			thread2.join();
			System.out.println("Thread2 Alive:" + thread2.isAlive());
			System.out.println("***************************");
			Thread thread3 = new Thread(number3);
			thread3.start();
			System.out.println("Thread3 Alive:" + thread3.isAlive());
			thread3.join();
			System.out.println("Thread3 Alive:" + thread3.isAlive());
			System.out.println("***************************");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
