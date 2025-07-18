package arrayPrograms;

import java.util.Arrays;

public class MakeNegativeToPositive {
	
	public static void main(String[] args) {
		
		int [] ar1 = {-1,-2,-3,-4};
		System.out.println(Arrays.toString(makeNegToPos(ar1)));
	}
	
	public static int[] makeNegToPos(int[]ar1)
	{
		for (int i = 0; i < ar1.length; i++)
		{
			if(ar1[i]< 0)
			{
				ar1[i] = ar1[i]*-1;
			}
		}
		return ar1;
	}

}
/*
 * [1, 2, 3, 4]
*/
