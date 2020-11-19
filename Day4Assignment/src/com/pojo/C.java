package com.pojo;

public class C extends B {

	private int a = 543;

	public void display() {

	System.out.printf("a in C = %d\n", a);
}
}

/*
Output:
a in A = 100
a in B = 123
a in B = 123
a in C = 543
a in C = 543
a in C = 543

*/