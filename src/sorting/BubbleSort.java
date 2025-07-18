package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] ar1 = {100,20,3,1,-8};
		
		
		System.out.println(Arrays.toString(bubbleSort(ar1)));
	
	}
	
	public static int[] bubbleSort(int[] ar1)
	{
		for (int i = 0; i < ar1.length; i++) //this loop is for iteration count
		{
			//Here ar1.length-1-i is taken, it's subtracting the index 
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
 * [-8, 1, 3, 20, 100]
*/
