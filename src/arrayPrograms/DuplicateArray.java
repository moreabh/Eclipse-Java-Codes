package arrayPrograms;

import java.util.Arrays;
import java.util.Iterator;

public class DuplicateArray {
	
	public static void main(String[] args) {
		
		int [] ar = {10,20,30,40};
		
		int [] dup = new int[ar.length];
		
		for (int i = 0; i < dup.length; i++)
		{
			dup[i] = ar[i];
			System.out.println(dup[i]);		
		}
		
//		for (int i = 0; i < dup.length; i++)
//		{
//			System.out.print(dup[i]+",");
//		}
		
//		System.out.println(Arrays.toString(dup)); 
		//Easier Way to print attributes of array
	}

}
/*
 * 10
20
30
40
*/  