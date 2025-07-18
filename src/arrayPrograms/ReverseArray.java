package arrayPrograms;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int [] ar1 = {10,20,30,40};
		int i = 0;
		int j = ar1.length-1; // 4-1 = 3
		for ( i = 0; i < ar1.length; i++) {//
//			Logic 1:-
			while(i<j) //2<1
			{
				int temp = ar1[i];
				ar1[i] = ar1[j]; 
				ar1[j] = temp;            
				
				i++;  
				j--; 
			}	
		}
		System.out.println(Arrays.toString(ar1));		
	}

}
/*
 * [40, 30, 20, 10]
*/
