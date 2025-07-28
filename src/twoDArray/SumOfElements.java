package twoDArray;

public class SumOfElements {

	public static void main(String[] args) {
		int [][] ar1 = {
								{1,2,3},
								{4,5,6},
								{7,8,9}
						};
		int sum = 0;
		
		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar1[i].length; j++) {
				
				sum = sum+ar1[i][j];
			}
		}
		System.out.println("Sum Of all the elements: "+sum);
	}
}
/*
 * Sum Of all the elements: 45
*/
