package arrayPrograms;

import java.util.Arrays;

public class ReverseArrayLogic3 {

	public static void main(String[] args) {
		
		int [] ar1 = {10,20,30,40,50};
		int [] ans = new int[ar1.length];
		
		int j = ar1.length-1;
		for (int i = 0; i <= ans.length/2; i++)
		{
			
			ans[i] = ar1[j];
			ans[j] = ar1[i];
			
			j--;
		}
		
		System.out.println(Arrays.toString(ans));
		
	}
}
/*
 * [50, 40, 30, 20, 10]
*/
