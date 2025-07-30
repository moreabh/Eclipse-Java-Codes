package twoDArray;

import java.util.Arrays;

public class MultiplicationOf2DArray {
	
		public static void main(String[] args)
		{
			int[][]a= {
					{1,2,3},    
					{4,5,6},
					{7,8,9}
			};
			int[][]b= {
					{1,2,3},
					{4,5,6},
					{7,8,9}
			};
			int[][] ans = multiplication(a,b);
			for(int i=0;i<a.length;i++)
			{
				System.out.println(Arrays.toString(ans[i]));
			}
		}
		
		public static int[][] multiplication(int[][]a,int[][]b)
		{
			int[][] c = new int[a.length][a.length];
			//i → row selector
			for(int i=0;i<a.length;i++)     //Outer loop → which row of a
			{ 
				// j → column selector        
				for(int j=0;j<a.length;j++)//Middle loop → which column of b
				{
					//k → pairwise multiplication of corresponding row & column values
					
					for(int k=0;k<a.length;k++)//Inner loop → multiply corresponding values and sum them up
					{                 
						c[i][j] = c[i][j]+a[i][k]*b[k][j];            
					}                      
				}
			}
			return c;
		}
}

/*
 * c[0][0] = (a[0][0]*b[0][0]) + (a[0][1]*b[1][0]) + (a[0][2]*b[2][0])
        = (1*1) + (2*4) + (3*7)
        = 1 + 8 + 21
        = 30
*/
 */
/*
[30, 36, 42]
[66, 81, 96]
[102, 126, 150]
*/