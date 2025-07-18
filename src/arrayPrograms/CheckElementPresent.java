package arrayPrograms;

import java.util.Iterator;

public class CheckElementPresent {

	public static void main(String[] args) {
		int [] ar = {12,13,14,15,16};
		System.out.println(checkElement(ar));
	}
	
	public static boolean checkElement(int[]ar)
	{
		int gE = 16;
		
		for (int i = 0; i < ar.length; i++) 
		{
			if(gE == ar[i])
			{
				System.out.println("Element Found: "+ar[i]);
				return true;
			}
		}
		System.out.println(gE+" is not Present in this array");
		return false;
	}
}
/*
 * Element Found: 16
true
*/



