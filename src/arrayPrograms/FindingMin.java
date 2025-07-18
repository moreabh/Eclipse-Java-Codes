package arrayPrograms;

public class FindingMin {

	public static void main(String[] args) {
		
		int [] ar1 = {1,23,45,56,76};
		
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < ar1.length; i++) 
		{
			if(ar1[i]<min)
			{
				min = ar1[i];
			}
			
		}
		System.out.println("Min Element: "+min);
	}
}
/*
 * Min Element: 1
*/
