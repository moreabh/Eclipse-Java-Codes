package sorting;

import java.util.Arrays;

public class MergeSortTwoPointer {

	public static void main(String[] args) {
		
		int [] ar1 = {5,15,18,20,55,60};
		int [] ar2 = {2,3,8,12,18,25,32,50,63};
		
		System.out.println(Arrays.toString(merge(ar1,ar2)));
		
	}
	
	public static int[] merge(int[]ar1, int[]ar2)
	{
		int [] ans = new int[ar1.length + ar2.length];
		
		int i=0, j=0, k=0;
		
		while(i<ar1.length && j<ar2.length)
		{
			if (ar1[i] <= ar2[j])
			{
				ans[k++] = ar1[i++];
				
			}
			else if (ar1[i] >= ar2[j] )
			{
				ans[k++] = ar2[j++];
				
			}
		}
		
		while(i<ar1.length)
		{
			ans[k++] = ar1[i++];
		}
		while(j<ar2.length)
		{
			ans[k++] = ar2[j++];
		}
		return ans;
	}

}

/*
 * [2, 3, 5, 8, 12, 15, 18, 18, 20, 25, 32, 50, 55, 60, 63]
*/
