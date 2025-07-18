package arrayPrograms;

import java.util.Arrays;

//Logic 1
public class HalfReverseArray {

	public static void main(String[] args)
	{
		int [] ar = {10,20,30,40,50,60};
		System.out.println(Arrays.toString(halfReverse(ar)));
		
	}
	
	public static int[] halfReverse(int[]ar)
	{
		int [] ans = new int[ar.length];
		
		for (int i = 0; i < ar.length/2; i++)
		{
			ans[i] = ar[i];
			
		}
		
		for (int i = ar.length-1, j = ar.length/2; i>= ar.length/2; i-- ,j++)
		{
			ans[j] = ar [i];
		}
		return ans;
	}
}
/*
 * [10, 20, 30, 60, 50, 40]
*/
