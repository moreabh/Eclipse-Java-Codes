package arrayas;

import java.util.Arrays;
import java.util.Iterator;

public class SortArrayDescending {

	public static void main(String[] args) {
		
		int[] ar1 = {1,2,3};
		int [] ar2 = {1,2,3};
		            //  0     3
		int[] ans = new int [ar1.length+ar2.length];
		
		int i = 0;          
		for (i = 0; i < ar1.length; i++) 
		{
			
			ans[i] = ar1[i];
		System.out.print(ans[i]+" ");
		}
		
		for (int j=0; j < ar2.length; j++)
		{
         if(i<ans.length){
			ans[i]  = ar2[j];
            if(i<ans.length-1)
            {
            i++;
            }
         System.out.print(ans[j]+" ");
         }
		
		}

	}

}

