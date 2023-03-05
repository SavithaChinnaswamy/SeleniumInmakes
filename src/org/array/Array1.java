package org.array;

public class Array1 
{
	public static void main(String[] args)
	{
		int A[] = new int [9];
		
		A [0]=10;
		A [1]=20;
		A [2]=30;
		A [3]=90;
		A [4]=10;
		A [5]=10;
		A [6]=40;
		A [7]=50;
		A [8]=10;
		
		System.out.println("Elements before replacing:");
		
		for(int i=0; i<A.length; i++)
		{
			System.out.println(A[i]);
		}
	
		
		
		System.out.println("Elements after replacing:");
		
	for(int i=0; i<A.length; i++)
	{
		if(A[i]==10)  
		{
			A[i]=100; 
		}
		System.out.println(A[i]);
	}
		
	}

}





