package arrayPrograms;

import java.util.Arrays;

public class MakeArrayEvenIfOdd 
{
	public static void main(String[] args) {
		
		int [] ar1 = {3,5,7,9};
		System.out.println(Arrays.toString(makeEvenIfOdd(ar1)));
		
	}
	
	public static int[] makeEvenIfOdd(int[]ar1)
	{
		for (int i = 0; i < ar1.length; i++) {
			if(ar1[i] % 2 !=  0)
			{
				ar1[i]=ar1[i]+1;
			}
		}
		return ar1;
	}
}

/*
 * [4, 6, 8, 10]
*/

