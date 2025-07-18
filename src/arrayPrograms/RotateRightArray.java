package arrayPrograms;

import java.util.Arrays;

public class RotateRightArray {

	public static void main(String[] args) 
	{
		int [] ar1 = {10,20,30,40,50};
		System.out.println(Arrays.toString(rotateRight(ar1,3)));                                                                                                                                           	 
		                                                           
	}
	
	public static int[] rotateRight(int[]ar1, int times)
	{
		for (int i = 0; i < times; i++)
		{
			int temp = ar1[ar1.length-1];
			
			for (int j = ar1.length-2; j >= 0; j--) 
			{
				ar1[j+1] = ar1[j];
			}
			
			ar1[0] = temp;
			
		}
		return ar1;                                                                                                                                          	
	}
}
/*
 * [30, 40, 50, 10, 20] 
*/
