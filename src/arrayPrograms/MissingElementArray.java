package arrayPrograms;

public class MissingElementArray {
	public static void main(String[] args) {
		
		int [] ar1 = {1,2,4,5,6};
		int max = Integer.MIN_VALUE;
		
		int sum = 0;
		for (int i = 0; i < ar1.length; i++)
		{
			sum = sum+ar1[i];
			if(ar1[i]>max)
			{
				max = ar1[i];
			}
		}
		int sumOfNat = max*(max+1)/2;
		System.out.println("The missing Element is: "+(sumOfNat-sum));
	}

}

/*
The missing Element is: 3
*/