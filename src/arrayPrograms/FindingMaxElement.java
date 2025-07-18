package arrayPrograms;

public class FindingMaxElement {

	public static void main(String[] args) {
		int [] ar1 = {1,12,24,56,87};
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < ar1.length; i++)
		{
			if(ar1[i]>max)
			{
				max = ar1[i];
			}
		}
		System.out.println("Max Element: "+max);		 
	}

}
/*
 * Max Element: 87
*/
