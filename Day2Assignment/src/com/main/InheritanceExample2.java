package com.main;

import com.pojo.Dog;
import com.pojo.ChildB;
/**
 * 
 * @author MokaSaiSuryaPrakash
 *
 *This program demonstrates the concept of inheritance
 */
public class InheritanceExample2 {

	public static void main(String[] args) {
		
		Dog dog=new Dog();
		
		dog.walk();
		dog.eat();
        dog.bark();

        dog=null;
	}

}
