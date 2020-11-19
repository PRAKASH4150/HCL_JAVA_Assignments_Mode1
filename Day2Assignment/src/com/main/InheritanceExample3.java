package com.main;

import com.pojo.Child1;
import com.pojo.Child2;
import com.pojo.Parent;
import com.pojo.ChildB;
/**
 * 
 * @author MokaSaiSuryaPrakash
 *
 *This program demonstrates the concept of inheritance
 */
public class InheritanceExample3 {

	public static void main(String[] args) {
		
		Parent parent =new Parent();

		Child1 child1 = new Child1();

		Child2 child2 = new Child2();

		System.out.println(child1 instanceof Parent);

		System.out.println(child2 instanceof Parent);

		System.out.println(parent instanceof Child1);

		System.out.println(parent instanceof Child2);

		parent = child1;

		System.out.println(parent instanceof Child1);

		System.out.println(parent instanceof Child2);

		parent = child2;

		System.out.println(parent instanceof Child1);

		System.out.println(parent instanceof Child2);

		parent=null;
		child1=null;
		child2=null;
	}

}
