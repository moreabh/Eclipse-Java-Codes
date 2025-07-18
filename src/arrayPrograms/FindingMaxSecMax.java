package arrayPrograms;

public class FindingMaxSecMax {

	public static void main(String[] args) {
		
	
	int [] ar1 = {1,34,65,78,99,97};
	
	int max = Integer.MIN_VALUE;
	int secMax = Integer.MIN_VALUE;
	
		for (int i = 0; i < ar1.length; i++)//1
		{
			if(ar1[i]>max)
			{
				secMax = max; //1 34   
				max = ar1[i]; //1 34
			}
			else if(ar1[i] > secMax && ar1[i] != max)
			{
				secMax = ar1[i];
			}
		}
		System.out.println("Max element: "+max);
		System.out.println("Second Max: "+secMax);
	}
}
/*
 * Max element: 99
Second Max: 97
*/
