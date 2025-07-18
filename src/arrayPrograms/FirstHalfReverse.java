package arrayPrograms;

import java.util.Arrays;

public class FirstHalfReverse {
	public static void main(String[] args) {
		
		int[] ar1 = {10,20,30,40,50};
		int[] ar2 = {60,70,80,90,100};
		
		System.out.println(Arrays.toString(firstHalfReverse(ar1,ar2)));
	}
	
	public static int[] firstHalfReverse(int[]ar1,int[]ar2) 
	{
		int mem = 0;
		int [] ans = new int[ar1.length + ar2.length];
		for (int i = 0; i < ans.length; i++)
		{
			if(i<ans.length/2)
			{
				ans[i] = ar1[ar1.length-1-i];
			}
			else
			{
				ans[i] = ar2[mem];
				mem++;
			}
		}
		
		return ans;
	}

}
/*
 * [50, 40, 30, 20, 10, 60, 70, 80, 90, 100]

*/
