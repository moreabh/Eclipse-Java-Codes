package sorting;

import java.util.Arrays;

public class QuickSorting {
	
	public static void main(String[] args) {
		
		int [] ar1 = {2,5,6,7,8,5,3,3,6,8,9,7};
		
		quickSort(ar1, 0, ar1.length-1);
		System.out.println(Arrays.toString(ar1));
		
	}
	
	public static void quickSort(int[]ar1, int start, int end)
	{
		if (start < end) 
		{
			int pos = partition(ar1,start,end);
			
			quickSort(ar1,start, pos-1);
			quickSort(ar1,pos+1, end);
			
		}
	}
	
	public static int partition(int[]ar1, int start, int end)
	{
		int ref = ar1[start];
		int i = start, j = end;
		
		while(i<j)
		{
			while(i<=end && ar1[i]<=ref)
			{
				i++;
				
			}
			while(j>start && ar1[j]>=ref)
			{
				j--;
			}
			if(i<j)
			{
				swap(ar1,i,j);
			}
			
		}
		swap(ar1,start,j);
		return j;	
	}
	
	public static void swap(int[]ar1, int i, int j)
	{
		
		int temp = ar1[i];
		ar1[i] = ar1[j];
		ar1[j] = temp;
	}

}
/*
 * [2, 3, 3, 5, 5, 6, 6, 7, 7, 8, 8, 9]
*/
