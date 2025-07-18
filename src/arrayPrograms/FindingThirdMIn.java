package arrayPrograms;

public class FindingThirdMIn {
	public static void main(String[] args) {
			
				int [] ar1 = {10,20,30,30,40,40,};
				
				int min = Integer.MAX_VALUE;
				int secMin = Integer.MAX_VALUE;
				int thirdMin = Integer.MAX_VALUE;
				
				for (int i = 0; i < ar1.length; i++) 
				{
					
					if(ar1[i] < min)
					{
						
						secMin = min;
						min = ar1[i];
					}
					else if(ar1[i] < secMin && ar1[i] != min)
					{
						secMin = ar1[i];
					}
					else if(ar1[i] < thirdMin && ar1[i] >secMin)
					{
						thirdMin = ar1[i];
					}
					
				}
				System.out.println("Min :"+min);
				System.out.println("Second Min: "+secMin);
				System.out.println("Third Min: "+thirdMin);

			}
	}
/*
Min :10
Second Min: 20
Third Min: 30
*/