package arrayPrograms;

import java.util.Iterator;

public class CountOfEvenOdd {
	public static void main(String[] args) {
		
		int [] ar = {1,2,34,56,76,77,88,43,21,43,55,235};
		
		int evenCount = 0;
		int oddCount = 0;
		
		for (int i = 0; i < ar.length; i++) {
			
			if(ar[i]%2 == 0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
			
		}
		System.out.println("Even Count: "+evenCount);
		System.out.println("Odd Count: "+oddCount);
	}
}
/*
 * Even Count: 5
Odd Count: 7
*/
