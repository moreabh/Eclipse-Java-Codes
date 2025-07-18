//Left Rotate Array
package arrayPrograms;

import java.util.Arrays;

public class RotateLeftArray {

	public static void main(String[] args) {
		
		int [] ar1 = {10,20,30,40,50,60};
		System.out.println(Arrays.toString(rotate(ar1, 1)));
	}
	
	public static int[] rotate(int[]ar1,int times)
	{
		for (int i = 0; i < times; i++) 
		{
			int temp = ar1[i];
			
			for (int j = 1; j < ar1.length; j++)
			{
				ar1[j-1] = ar1[j]; 
			}
			ar1[ar1.length-1] = temp;
		}
		return ar1;
	}
}
/*
 * [20, 30, 40, 50, 60, 10]
*/
