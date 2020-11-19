package com.main;

import com.pojo.FirstClass;
import com.pojo.SecondClass;

public class OOPExcercise1 {

	public static void main(String[] args) {

		FirstClass objA = new FirstClass();
		SecondClass objB = new SecondClass();
		
		System.out.println("in main(): ");
		System.out.println("objA.a = " + objA.getFirstClass());
		System.out.println("objB.b = " + objB.getSecondClass());
		objA.setFirstClass(222);
		objB.setSecondClass(333.33);
		System.out.println("objA.a = " + objA.getFirstClass());
		System.out.println("objB.b = " + objB.getSecondClass());

	}

}
