package arrayPrograms;

public class SumOfArrayElement {

	public static void main(String[] args) {
		int [] ar = {10,20,30,40,50};
		
		int sum = 0;
	
		  for (int i = 0; i < ar.length; i++) 
		  {
			  sum = sum+ar[i];
		  }
		  System.out.println("Sum: "+sum);
	}
	
}

/*Sum: 150 */
