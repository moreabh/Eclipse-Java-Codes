package twoDArray;

import java.util.Arrays;

public class DeclaringArrayInArray {

	public static void main(String[] args) {
		
		int [][] ar1 = new int[3] [3];
		
		System.out.println("length: "+ar1.length);
		for (int i = 0; i < ar1.length; i++) {
		
		
			System.out.print(Arrays.toString(ar1[i]));
		}
		
		System.out.println();
	}
}
/*
length: 3
[0, 0, 0][0, 0, 0][0, 0, 0]
*/