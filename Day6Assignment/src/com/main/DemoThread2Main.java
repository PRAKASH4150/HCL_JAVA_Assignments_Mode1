package com.main;

import com.service.DemoThread2;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * 
 * Rewriting the DemoThread1 program so that, now the class DemoThread2 instead of implementing from Runnable interface, 
 * will now extend from Thread class
 *
 */
public class DemoThread2Main {

	public static void main(String[] args) {

		DemoThread2 demoThread1 = new DemoThread2();
		DemoThread2 demoThread2 = new DemoThread2();
		DemoThread2 demoThread3 = new DemoThread2();

		demoThread1.start();
		demoThread2.start();
		demoThread3.start();
		
		demoThread1=null;
		demoThread2=null;
		demoThread3=null;
		
		
	}

}
