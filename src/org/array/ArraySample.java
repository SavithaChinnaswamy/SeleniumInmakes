package org.array;

import java.util.Arrays;

public class ArraySample
{
	public static void main(String[] args)
	{
		int arr[] = new int [11];
		
		arr [0]=10;
		arr [1]=20;
		arr [2]=30;
		arr [3]=90;
		arr [4]=10;
		arr [5]=10;
		arr [6]=40;
		arr [7]=50;
		
		
	System.out.println(Arrays.toString(arr));
	
	int index = 10;
	int value = 100;
	
	for (int i = arr.length - 1; i > index; i--)
	{
		arr[i]=arr[i-1];
	}
	arr[index] = value;
	for (int i : arr)
	{
		System.out.println(i);
	}
	}
}

	
//Description : Replace the element 300 into 350 in the list
//Input : List = 100, 200, 300, 400, 500, 600, 700
