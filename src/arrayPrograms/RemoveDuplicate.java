package arrayPrograms;

import java.util.Arrays;

public class RemoveDuplicate 
{

	public static void main(String[] args) 
	{
		int [] ar1 = {1,2,3,2,1,5,6,3};
		System.out.println(Arrays.toString(removeDuplicate(ar1)));
		
	}
	
	public static int[] frequencyOfElement(int[]ar1)
	{
		int [] count = new int[ar1.length];
		//               0< 6
 		for (int i = 0; i < ar1.length; i++) {
			
			int ct = 0;
			//        0
			if (count[i] != -1) 
			{            //    1   
				for (int j = i+1; j < ar1.length;j++)
				{
					if(ar1[i] == ar1[j])
					{
						ct++;
						count[j] = -1;
					}
					
				}
				count[i] = ct;
			}
		}
		return count;
	}
	
	public static int[] removeDuplicate(int[]ar1)
	{
		
		int [] freq = frequencyOfElement(ar1);
		int negCount = 0;
		
		for (int i = 0; i < freq.length; i++) {
			
			if (freq[i] == -1)
			{
				negCount++;
			}
		}
		int [] ans = new int[ar1.length-negCount];
		
		for (int i = 0, j = 0; i < ar1.length; i++) 
		{
			if(freq [i] != -1)
			{
				ans[j] = ar1[i];
				j++;
			}	
		}
		return ans;	
	}
}
/*
 * [1, 2, 3, 5, 6]
*/
