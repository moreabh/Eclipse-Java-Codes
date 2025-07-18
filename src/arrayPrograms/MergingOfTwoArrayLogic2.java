package arrayPrograms;

import java.util.Arrays;

public class MergingOfTwoArrayLogic2 
{
	public static void main(String[] args) {
		
		int[] ar1 = {10,20,30,40,50};
		int[] ar2 = {60,70,80,90,100};
		
		System.out.println(Arrays.toString(mergeArray(ar1,ar2)));
		
	}
//	Logic 2 :-
	public static int[] mergeArray(int[]ar1, int[]ar2)
	{
		int [] ans = new int[ar1.length + ar2.length];
	
		for (int i = 0; i < ans.length; i++)
		{
			if(i<ar1.length)
			{
				ans[i] = ar1[i];
			}
			else
			{
				ans[i] = ar2[i-ar1.length];
			}
		}
		
		return ans;
	}
}
/*
 * [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
*/
