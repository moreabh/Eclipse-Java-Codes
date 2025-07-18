package arrayPrograms;

import java.util.Arrays;

public class RemoveAllTheOccurence 
{

	public static void main(String[] args) 
	{
		int [] ar1 = {1,2,3,1,2,3,4,5,4,6,7,8};
		System.out.println(Arrays.toString(removeOccurence(ar1,2)));
		
	}

	public static int[] removeOccurence(int[]ar1,int ele)
	{
		
		int count = 0;
		
		for (int i = 0; i < ar1.length; i++)
		{
			if(ar1[i]==ele)
			{
				count++;
			}
		}
		if(count>0)
		{
			int [] ans = new int[ar1.length-count];
			
			for (int  i = 0, j=0; i < ar1.length; i++)
			{
				if (ar1[i] != ele)
				{
					ans[j++] = ar1[i]; 
				}
				
			}
			return ans;
		}
		return ar1;
		
	}
}
/*
[1, 3, 1, 3, 4, 5, 4, 6, 7, 8]
*/