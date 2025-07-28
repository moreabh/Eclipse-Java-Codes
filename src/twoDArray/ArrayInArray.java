package twoDArray;

import java.util.Arrays;

public class ArrayInArray {

	public static void main(String[] args) {
		
		int [][] ar1 = {
				{1,2,3,4,5},
				{6,7,8,9,10} 
				};
		
		for (int i = 0; i < ar1.length; i++) 
		{
				System.out.println(Arrays.toString(ar1[i]));	
		}
	}
}
