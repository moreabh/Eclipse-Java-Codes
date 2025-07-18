package arrayPrograms;

import java.util.Arrays;

public class ZigZagCopy {
	
	public static void main(String[] args) {
		
		int[] ar1 = {10,20,30,40,50,60};
		int[] ar2 = {70,80,90,100,110,120};
		System.out.println(Arrays.toString(zigZagCopy(ar1,ar2)));
		
		}
	
	public static int[] zigZagCopy(int[]ar1, int[]ar2)
	{
		int [] ans = new int[ar1.length + ar2.length];
		int mem = 0;
		
		if(ar1.length>ar2.length)
		{
			int i;
			for ( i = 0; i < ar2.length; i++,mem=mem+2)
			{
				ans[mem] = ar1[i];
				ans[mem+1] = ar2[i];
			}
			
			while(i<ar1.length)
			{
				ans[mem] = ar1[i];
				mem++;
				i++;
			}
			//if ar1 length is greater than ar2 
//			[10, 70, 20, 80, 30, 90, 40, 100, 50, 60]
		}
		
		else if(ar1.length<ar2.length)
		{
			//if ar2 length is greater than ar1
			//[10, 70, 20, 80, 30, 90, 40, 100, 50, 110, 60, 120, 130]

			
			int i;
			for ( i = 0; i < ar1.length; i++,mem=mem+2)
			{
				ans[mem] = ar1[i];
				ans[mem+1] = ar2[i];
			}
			
			while(i<ar2.length)
			{
				ans[mem] = ar2[i];
				mem++;
				i++;
			}
		}
		
		else
		{
			int i;
			for ( i = 0; i < ar2.length; i++,mem=mem+2)
			{
				ans[mem] = ar1[i];
				ans[mem+1] = ar2[i];
			}
			//if both arrays are same length
			//[10, 70, 20, 80, 30, 90, 40, 100, 50, 110, 60, 120]
			
		}
	
		return ans;
	}
}
