package twoDArray;

import java.util.Scanner;

public class ArrayPrintingAllElements {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int [][] ar1 = new int [3][3];
		 System.out.println("Enter the element: ");
		 
		 for (int i = 0; i < ar1.length; i++) 
		 {
			for (int j = 0; j < ar1[i].length; j++)
			{
				ar1[i][j] = sc.nextInt();
				
			}
		}
		 
		 System.out.println("Elements are: ");
		 
		 for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar1[i].length; j++) {
				System.out.print(ar1[i][j]+" ");
			}
			 System.out.println();		
		}
		
	}
}
/*
 * Enter the element: 
1
2
3
4
5
6
7
8
9
Elements are: 
1 2 3 
4 5 6 
7 8 9 
*/
