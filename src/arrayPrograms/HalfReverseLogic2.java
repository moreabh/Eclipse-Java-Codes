package arrayPrograms;

import java.util.Arrays;

public class HalfReverseLogic2 {
	
	public static void main(String[] args) 
	{
		int [] ar = {10,20,30,40,50,60};
		System.out.println(Arrays.toString(halfReverse(ar)));
		
	}
//	Logic 2:-
	public static int[] halfReverse(int[]ar)
	{
		int [] ans = new int[ar.length];
		
		for (int i = 0, j = ar.length-1; i < ar.length; i++) 
		{
			if(i< ar.length/2)
			{
				ans[i] = ar[i];	
			}
			else
			{
				ans[i] = ar[j];
				j--;
			}
		}
		return ans;
	}
}
/*
[10, 20, 30, 60, 50, 40]
*/

