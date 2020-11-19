package com.pojo;

public class ArraySorting {

	private int temp;
	public int[] sortArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		return array;
	}
}
