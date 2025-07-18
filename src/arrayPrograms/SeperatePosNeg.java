package arrayPrograms;

import java.util.Arrays;

public class SeperatePosNeg {

	public static void main(String[] args) {
		
		int[] ar1 = {1,-1,-2,3,4,5};
		//System.out.println(Arrays.toString(separatePosNeg(ar1)));
		int j = 0;
		
		 for (int i = 0; i < ar1.length; i++) {
			 
	            if (ar1[i] < 0)
	            {
	                // swap arr[i] and arr[j]
	                int temp = ar1[i];
	                ar1[i] = ar1[j];
	                ar1[j] = temp;
	                j++;
	            }
	        }
		
	}
	public static int[] separatePosNeg(int[]ar1)
	{
		
		
		
		return ar1;
	}
}
