package arrayPrograms;

import java.util.Arrays;

public class RemoveRangeOfArray {

public static void main(String[] args) {
	int [] ar1 = {10,20,30,40,50,60,70};
	System.out.println(Arrays.toString(removeRange(ar1,2,5)));
}

public static int[] removeRange(int[]ar1,int start , int end) 
{
	if(start < end)
	{//							7-(5-2) = 4	
		int [] ans  = new int[ar1.length-(end-start)];
		//					2<	4
		for (int i = 0; i < ar1.length;) 
		{//		2<	2
			if(i<start)
			{
				ans[i] = ar1[i];   //10 20
				i++; 
				
			}//		2 == 2
			else if(i==start)
			{ //i= 2+(5-2) =5
				i = i+(end-start);
			}//      5,6 7< 7
			else if(i< ar1.length)
			{
				//  5-(5-2) =2           5
				//  6-(5-2) =3           6
				//  7-(5-2) =4           7
				ans[i-(end-start)] = ar1[i];
				i++;
			}
			
		}
		return ans;
	}
	return null;
	
   }

}
/*
 * [10, 20, 60, 70]
*/
 

