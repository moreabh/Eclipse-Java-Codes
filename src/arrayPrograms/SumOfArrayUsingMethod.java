package arrayPrograms;

public class SumOfArrayUsingMethod {

	public static void main(String[] args) {
		
		int [] ar = {10,20,30,40,50};
		
		System.out.println(sumOfArray(ar));
	}
		
	
	public static int sumOfArray(int[]ar) 
	{
		int sum = 0;
		for (int i = 0; i < ar.length; i++) 
		{
			sum = sum + ar[i];
		}
	return sum;
		
	}
}
/*
 * 150
*/
