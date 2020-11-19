package com.service;

public class DemoThread2 extends Thread {
	public DemoThread2() {
		Thread thread = new Thread();
		thread.start();
		System.out.println("Thread in the constructor");
		System.out.println("----------------------------");
	}

	@Override
	public void run() {

		System.out.println("Running child thread in Loop");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {

				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
