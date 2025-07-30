//Addition of two matrix
package twoDArray;

import java.util.Arrays;

public class AdditionOfTwoMatrix {

	public static void main(String[] args) {
		int [][] ar1 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int[][] ar2 = {
				{10,11,12},
				{13,14,15},
				{16,17,18}
		};
		
		if (ar1.length == ar2.length) 
		{
			int i = 0;
			
			for (i = 0; i < ar1.length; i++)
			{
				//    3         !=  3
				if (ar1[i].length != ar2[i].length)
				{
					break;
				}	
			}
			// 3 == 3
			if(i==ar1.length)
			{                        //   3            
				int [][] ans = new int[ar1.length][ar1[0].length];
				     //      3    3 <3
				for (int j = 0; j < ar1.length; j++) {
					     //    	  3          2      3
					for (int j2 = 0; j2 < ar1[j].length; j2++) {
						//  2   2    							i=0		 i=1		i=2
						ans[j][j2] = ar1[j][j2] + ar2[j][j2];//11,13,15; 17,19,21; 	23,25,27
					}
				}
				
				for (int j = 0; j < ans.length; j++) {
					System.out.println(Arrays.toString(ans[j]));
				}
			}
		
			
		}	
	}
}
/*
[11, 13, 15]
[17, 19, 21]
[23, 25, 27]
*/
