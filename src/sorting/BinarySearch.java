package sorting;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int [] ar1 = {10,50,100,150,250,200};
		
		System.out.println(Arrays.toString(bubbleSort(ar1)));
		binarySearch(ar1, 200);
	}
	
	public static void binarySearch(int[]ar1, int search)
	{
		bubbleSort(ar1);
		int start = 0, end = ar1.length-1, mid = (start+end)/2;
		
		while (start <= end) 
		{
			
			if (ar1[mid] == search)
			{
				System.out.println("Element Found at index: "+mid);	
				
				break;
			}
			else if (search > ar1[mid])
			{
				start = mid+1;
				
			}
			else if (search<ar1[mid]) 
			{
				end = mid-1;
				
			}
			mid = (start + end)/2;
		}
		
		
		if (start>end)
		{
			System.out.println("Element not found");
		}
	} 
	
	public static int[] bubbleSort(int[]ar1)
	{
		for (int i = 0; i < ar1.length; i++) //this loop is for iteration count
		{
			//Here ar1.length-1-i is taken it's subtracting the iteration 
			for (int j = 0; j < ar1.length-1-i; j++) //this loop is for to sort the values
			{

				if (ar1[j]>ar1[j+1]) 
				{
					int temp = ar1[j];
					ar1[j] = ar1[j+1];
					ar1[j+1] = temp;
				}
				
			}
			
		}
		return ar1;
	}

}
/*
 * [10, 50, 100, 150, 200, 250]
Element Found at index: 4
*/
