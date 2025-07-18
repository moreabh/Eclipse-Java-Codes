package arrayPrograms;

import java.util.Arrays;

public class AddingArrayAtGivenIndex {
	public static void main(String[] args) {
		int [] ar1 = {10,20,30,40,50,60,70};
		int [] ar2 = {100,200,300};
		System.out.println(Arrays.toString(insertAtIndex(ar1,ar2,5)));
		
	}

	public static int[] insertAtIndex(int[]ar1,int[]ar2,int index )
	{
		if(index>=0 && index<=ar1.length)
		{
			int [] ans = new int [ar1.length+ar2.length];
			
			for (int i = 0,j=0; i < ans.length; i++)
			{
				if(i<index)
				{
					ans[i] = ar1[i];
				}
				else if(i<ar2.length+index)
				{
					ans[i] = ar2[j];
					j++;
				}
				else 
				{
					ans[i] = ar1[i-ar2.length];
				}
				
			}
			return ans;
		}
		
		return null;
	}

}
