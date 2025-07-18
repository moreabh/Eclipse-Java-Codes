package arrayPrograms;

import java.util.Arrays;

public class ReverseArrayLogic2 {
	public static void main(String[] args) {
		
		int [] ar1 = {10,20,30,40,50,60,70};
		
		int j = ar1.length-1; //2
		for (int i = 0; i < ar1.length; i++) {
//		Logic 2
			while(i<j)
		{
			ar1[i] = ar1[i] + ar1[j]; //0+2                        //30
			ar1[j] = ar1[i] - ar1[j]; //0-
			ar1[i] = ar1[i] - ar1[j];
			
			i++;
			j--;
		}
		}
		System.out.println(Arrays.toString(ar1));
	}
}
/*
 * [70, 60, 50, 40, 30, 20, 10]
*/
