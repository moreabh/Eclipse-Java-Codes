package arrayPrograms;

import java.util.Arrays;

public class SegrigatingPosNegative {
	public static void main(String[] args) {
		
		int [] ar1 = {1,-2,3,-4,5,-6};
		
		int i = 0, j = ar1.length-1;
		 for (i = 0; i < ar1.length; i++) 
		 {
			while(ar1[i] < 0)
			{
				i++;
			}
			while(ar1[j] > 0)
			{
				j--;
			}
			if(i<j)
			{
				int temp = ar1[i];
				ar1[i] = ar1[j];
				ar1[j] = temp;
			}
		 }
		
		System.out.println(Arrays.toString(ar1));
		
	}
}
/*
 * [-6, -2, -4, 3, 5, 1]
*/
