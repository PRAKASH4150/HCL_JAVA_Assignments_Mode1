package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.service.ArrayListMerge;
/**
 * 
 * @author MokaSaiSuryaPrakash
 *
 *code to read two int array lists of size 5 each as input and to merge the two arrayLists, 
 *sort the merged arraylist in ascending order and fetch the elements at 2nd, 6th and 8th index
 * into a new arrayList and return the final ArrayList.
 */
public class ArrayListMergeMain {

	public static void main(String[] args) {
	
		ArrayListMerge arrayListMerge=null;
		Scanner scanner=new Scanner(System.in);
		
		List<Integer> outputResultList;
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		
		int list1Size;
		int list2Size;
		
		System.out.println("Enter the list-1 size");
		list1Size=scanner.nextInt();
		
		for(int i=0;i<list1Size;i++)
		{
			System.out.println("Enter the value");
			list1.add(scanner.nextInt());
		}
		
		System.out.println("Enter the list-2 size");
		list2Size=scanner.nextInt();
		
		for(int i=0;i<list2Size;i++)
		{
			System.out.println("Enter the value");
			list2.add(scanner.nextInt());
		}
		
		arrayListMerge=new ArrayListMerge();
		outputResultList=new ArrayList<Integer>();
		outputResultList=arrayListMerge.sortMergedArrayList(list1, list2);
		
		System.out.println("************Output************");
		for(Integer element : outputResultList)
		{
			System.out.println(element);
		}
		
		arrayListMerge=null;
		outputResultList=null;
		list1=null;
		list2=null;
		scanner.close();

	}

}
