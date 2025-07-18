//Merging Of Two Arrays
package arrayPrograms;

import java.util.Arrays;

public class MerigingOfTwoArray {
	public static void main(String[] args) {
		
		int [] ar1 = {10,20,30,40,50};
		int [] ar2 = {60,70,80,90,100};
		
		System.out.println(Arrays.toString(mergeArray(ar1,ar2)));
	}
	//Logic 1 :- 
	public static int[] mergeArray(int[]ar1, int[]ar2)
	{
		int mem = 0;
		int [] ans = new int [ar1.length + ar2.length];
		
		for (int i = 0; i < ar1.length; i++,mem++)
		{
			ans[mem] = ar1[i];
		}
		
		for (int i = 0; i < ar2.length; i++,mem++)
		{
			ans[mem] = ar2[i];
			
		}
		return ans;

 	}
}
/*
 * [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
*/
