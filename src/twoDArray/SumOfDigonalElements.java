package twoDArray;

import java.util.Iterator;

public class SumOfDigonalElements {

	public static void main(String[] args) {
		
		int [] [] ar1 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int sum = 0;
		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar1[i].length; j++) {
				
				
				if(i==j)
				{
					System.out.println("digonal elements: "+ar1[i][j]);
					sum=sum+ar1[i][j];
				}
				
			}
		}
		System.out.println("Sum of All the Digonal Elements: "+sum);
	}
}
/*
 * digonal elements: 1
digonal elements: 5
digonal elements: 9
Sum of All the Digonal Elements: 15
*/
