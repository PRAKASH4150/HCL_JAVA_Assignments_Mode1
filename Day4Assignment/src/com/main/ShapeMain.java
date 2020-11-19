package com.main;

import java.util.Scanner;

import com.pojo.Circle;
import com.pojo.Rectangle;
import com.pojo.Square;
/**
 * 
 * @author MokaSaiSuryaPrakash
 *
 *This program deals with the implementation of abstract classes and inheritance
 */
public class ShapeMain {

	public static void main(String[] args) {
		
	 String shapeName;
	 float result;
	 Scanner scanner=new Scanner(System.in);
	 
     System.out.println("Enter the shape name");
     shapeName=scanner.nextLine();
     
     if(shapeName.equalsIgnoreCase("Circle"))
     {
    	 int radius;
    	 System.out.println("Enter the radius");
    	 radius=scanner.nextInt();
    	 
    	 Circle circle=new Circle(shapeName,radius);
    	 result=circle.calculateArea();
    	 
    	 System.out.println("The area of circle is:"+result);
    	 
    	 circle=null;
     }
     else if(shapeName.equalsIgnoreCase("Square"))
     {
    	 int side;
    	 System.out.println("Enter the side");
    	 side=scanner.nextInt();
    	 
    	 Square square=new Square(shapeName,side);
    	 result=square.calculateArea();
    	 System.out.println("The area of square is:"+result);
    	 square=null;
    	 
     }
     else if(shapeName.equalsIgnoreCase("Rectangle"))
     {
    	 int length;
    	 int breadth;
    	 
    	 System.out.println("Enter the length");
    	 length=scanner.nextInt();
    	 System.out.println("Enter the breadth");
    	 breadth=scanner.nextInt();
    	 
    	 Rectangle rectangle=new Rectangle(shapeName,length,breadth);
    	 result=rectangle.calculateArea();
    	 
    	 System.out.println("The area of rectangle is:"+result);
    	 
    	 rectangle=null;
     }
     
     else
     {
    	 System.out.println("Invalid Shape");
     }
		
     scanner.close();
	}

}
