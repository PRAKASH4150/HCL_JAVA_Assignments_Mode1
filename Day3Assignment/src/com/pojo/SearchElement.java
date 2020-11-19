package com.pojo;

public class SearchElement {

	private int indexValue;
	private int flag=0;
	
	public int searchforElement(int[] array,int element)
	{
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==element)
			{
				indexValue=i;
				flag=1;
				break;
			}
		}
		
		if(flag==1)
		{
			return indexValue+1;
		}
		
		else
		{
			return -1;
		}
	}
}
