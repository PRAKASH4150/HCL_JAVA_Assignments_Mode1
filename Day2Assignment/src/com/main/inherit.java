package com.main;

import com.pojo.ChildB;
/**
 * 
 * @author MokaSaiSuryaPrakash
 *
 *This program demonstrates the concept of inheritance
 */
public class inherit {

	public static void main(String[] args) {
		
		ChildB childB=null;
		
		String str1;
		String str2;
		
		childB=new ChildB();
		
		str1=childB.display();
		str2=childB.print();
		
		System.out.println(str1);
		System.out.println(str2);

	}

}
