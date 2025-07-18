package arrayPrograms;

import java.util.Arrays;

public class ReverseMerging {

	public static void main(String[] args) {
		
		int[] ar1 = {10,20,30,40,50};
		int[] ar2 = {60,70,80,90,100};
		System.out.println(Arrays.toString(reverseMerge(ar1,ar2)));
		
	}
	
	public static int[] reverseMerge(int[]ar1, int[]ar2)
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
				ans[i] = ar2[ans.length-1-i];
			}
		
		}
		return ans;
	}
}

/*
[10, 20, 30, 40, 50, 100, 90, 80, 70, 60]

*/