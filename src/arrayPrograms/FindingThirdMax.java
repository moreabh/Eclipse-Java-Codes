package arrayPrograms;

public class FindingThirdMax {

	public static void main(String[] args) {
		
		int [] ar1 = {10,20,20,30,40,40,50,50};
		
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		
		
		for (int i = 0; i < ar1.length; i++) {
		
			if(ar1[i] > max)
			{
				thirdMax = secMax;
				secMax = max;
				max = ar1[i];
			}
			else if(ar1[i] > secMax && ar1[i] != max)
			{
				
				secMax = ar1[i];
			}
			
			else if(ar1[i] > thirdMax && ar1[i] < secMax)
			{
				thirdMax = ar1[i];
			}
		}
		System.out.println("Max: "+max);
		System.out.println("Second Max: "+secMax);
		System.out.println("Third Max: "+thirdMax);
		
	}
}
/*
 * Max: 50
Second Max: 40
Third Max: 30
*/
