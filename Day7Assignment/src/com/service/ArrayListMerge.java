package com.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMerge {

	public List<Integer> sortMergedArrayList(List<Integer>list1,List<Integer>list2)
	{
		List<Integer> mergedList = new ArrayList<Integer>();
		List<Integer> finalList=null;
		
		mergedList.addAll(list1);
		mergedList.addAll(list2);
		
		Collections.sort(mergedList);
		
		finalList=new ArrayList<Integer>();
		
		finalList.add(mergedList.get(2));
		finalList.add(mergedList.get(6));
		finalList.add(mergedList.get(8));
		
		return finalList;
	}
}
