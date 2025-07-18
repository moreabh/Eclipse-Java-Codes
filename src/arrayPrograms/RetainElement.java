package arrayPrograms;

import java.util.Arrays;

public class RetainElement {

	public static void main(String[] args) {
		
		int [] ar1 = {1,2,3,4,5,};
		int [] ar2 = {2,4,7};
		System.out.println(Arrays.toString(removeElement(ar1, ar2)));
		
	}
	
	public static int[] removeElement(int[]ar1,int[]ar2)
	{
		boolean [] occ = new boolean[ar1.length];
		
		int ct = 0;
		for (int i = 0; i < ar2.length; i++) //this loop is for ar2 
		{
			for (int j = 0; j < ar1.length; j++) //this loop is for ar1
			{
				if(ar2[i] == ar1[j])
				{
					ct++;
					occ[j] = true;
				}
			}
		}
		if(ct>0)
		{
			int [] ans = new int[ar1.length-ct];
			
			for (int i = 0,j=0; i < ar1.length; i++)
			{
				if(occ[i] != true)
				{
					ans[j] = ar1[i];
					j++;
				}
				
			}
			return ans;
		}
		return ar2;	
	}
}
/*
 * [1, 3, 5]
*/
