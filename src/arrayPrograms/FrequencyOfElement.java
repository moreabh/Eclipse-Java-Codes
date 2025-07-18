package arrayPrograms;

import java.util.Arrays;

public class FrequencyOfElement {

	public static void main(String[] args) {
		
		int[] ar1 = {1,2,3,2,1,3,2};
		
		System.out.println(Arrays.toString(frequencyOfElement(ar1)));
		
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
		//            6  6<6
		for (int i = 0; i < count.length; i++) 
		{
			if(count[i] != -1)
			{
				System.out.println(ar1[i]+" Repeated "+count[i]+" times");
			}
			
		}
		
		return count;
		
	}
}
/*
 * 1 Repeated 1 times
2 Repeated 2 times
3 Repeated 1 times
[1, 2, 1, -1, -1, -1, -1]
*/
