package sorting;

import java.util.Arrays;

public class MergeSortOfSameArray {
	

	public static void main(String[] args) {
		int [] ar1 = {-8,3,6,4,-2,1,9,5,30,0,1};
		
		mergeSort(ar1, 0, ar1.length-1);
		
		System.out.println(Arrays.toString(ar1));
	}
	
	public static void mergeSort(int[]ar1,int start, int end)
	{
		if(start < end)
		{
		int mid = (start + end)/2;
		
		mergeSort(ar1,start,mid);
		mergeSort(ar1,mid+1,end);
		
		mergeSameArray(ar1, start, mid, end);
		
		}		
	}
	
	public static int[] mergeSameArray(int[]ar1, int start, int mid, int end)
	{
		int [] ans = new int[ar1.length];
		
		int i = start, j = mid+1, k = start;
		
		while (i<=mid && j<=end)
		{
			if (ar1[i]<=ar1[j])
			{
				ans[k++] = ar1[i++];
			}
			else if(ar1[i]> ar1[j])
			{
				ans[k++] = ar1[j++];
			}
		}
		
		while(i<= mid) 
		{
			ans[k++] = ar1[i++];
		}
		while(j<=end)
		 {
			ans[k++] = ar1[j++];
		}
		for (int k2 = start; k2 < end; k2++)
		{
			ar1[k2] = ans[k2];
			
		}
		return ar1;
	}
}
