package arrayPrograms;

public class SumEvenOddArray {
	
	public static void main(String[] args) {
		
		 int [] ar = {10,5,2,7,188,33,55,67,35,90};
		 
		 int evenSum = 0;
		 int oddSum = 0;
		 int evenCount = 0;
		 int oddCount = 0;
		 
		 for (int i = 0; i < ar.length; i++) 
		 {
			 if(ar[i] % 2 == 0)
			 {
				 evenSum = evenSum + ar[i];
				 evenCount++;
			 }
			 else
			 {
				 oddSum = oddSum + ar[i];
				 oddCount++;
			 }
		}
		 System.out.println("Even Sum: "+evenSum+", Even Count: "+evenCount);
		 System.out.println("Odd Sum: "+oddSum+", Odd Count: "+oddCount);
		 if(evenSum == oddSum)
		 {
			 System.out.println("Even Sum and Odd Sum is Equal");
		 }
		 else
		 {
			System.out.println("Even Sum and Odd Sum is diffrent");
		 }
	}
}
/*
 * Even Sum: 290, Even Count: 4
Odd Sum: 202, Odd Count: 6
Even Sum and Odd Sum is diffrent
*/
