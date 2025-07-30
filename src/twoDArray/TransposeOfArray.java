package twoDArray;

import java.util.Arrays;

public class TransposeOfArray {

	public static void main(String[] args) {
		
		char [][] ar1 =   {
							{'a','b','c','d'},			// a e i m
							{'e','f','g','h'},			// b f j n
							{'i','j','k','l'},			// c g k o
							{'m','n','o','p'}			// d h l p
						};
		//           3  3          4  
		for (int i = 0; i < ar1.length; i++) {
			
			//           4  4       3    4   
			for (int j = 0; j < ar1[i].length; j++) {
				
				char temp  = 0;
				// 3<3 p
				if(i<j)
				{  //          2  3
					temp = ar1[i][j];      	// temp = l
					ar1[i][j] = ar1[j][i];  // 23  = 32  o    
					ar1[j][i] = temp;       // 32 =  l
   				}
				
			}
			System.out.println(Arrays.toString(ar1[i]));
			
		}

	}

}
/*
[a, e, i, m]
[b, f, j, n]
[c, g, k, o]
[d, h, l, p]
*/
