package com.service;

public class MyThread extends Thread {

	@Override
	public void run() {

		System.out.println("This is a thread");
		System.out.println();
		System.out.println("Name of the thread:" + Thread.currentThread().getName());
		System.out.println();
		System.out.println("System Time Before:" + System.currentTimeMillis() + "ms");
		System.out.println();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("System Time After:" + System.currentTimeMillis() + "ms");

	}

}
