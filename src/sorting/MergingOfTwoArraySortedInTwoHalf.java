package sorting;

import java.util.Arrays;

public class MergingOfTwoArraySortedInTwoHalf {

	public static void main(String[] args)
	{
		int [] ar1 = {1,3,5,7,9,0,2,4,6,8};
		System.out.println(Arrays.toString(mergeSame(ar1)));
		
	}
	
	public static int[] mergeSame(int[]ar1)
	{
		int [] ans = new int[ar1.length];
		int i = 0, j = ar1.length/2, k = 0;
		
		while(i<ar1.length/2 && j<ar1.length)
		{
			if(ar1[i]<=ar1[j])
			{
				ans[k++] = ar1[i++];
			}
			else if(ar1[i]>=ar1[j])
			{
				ans[k++] = ar1[j++];
			}
		}
		
		while(i<ar1.length/2)
		{
			ans[k++] = ar1[i++];
		}
		while(j<ar1.length)
		{
			ans[k++] = ar1[j++];
		}
		return ans;
	}

}
