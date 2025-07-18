package arrayPrograms;

import java.util.Arrays;

public class AddingElementGivenIndex {

	public static void main(String[] args) {
		
		int [] ar1 = {10,20,30,50,60};
		System.out.println(Arrays.toString(addingElement(ar1, 3)));
	}
	
	public static int [] addingElement(int []ar1, int a)
	{
		int index = 3, ele =40;
		
		if(index>0 && index<= ar1.length)
		{
		int [] ans = new int[ar1.length+1];
		
		for (int i = 0; i < ans.length; i++)
		{
			if(i<index)
			{
				ans[i] = ar1[i];
			}
			else if(i == index)
			{
				ans[i] = ele;
			}
			else
			{
				ans[i] = ar1[i-1];
			}
		}
		return ans;

		}
		return null;
	}

}
/*
 * [10, 20, 30, 40, 50, 60]
*/
