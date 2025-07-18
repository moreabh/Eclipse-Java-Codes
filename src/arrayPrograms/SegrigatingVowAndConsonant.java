package arrayPrograms;

import java.util.Arrays;

public class SegrigatingVowAndConsonant {
	public static void main(String[] args) {
		
		char [] ar1 = {'a','b','c','d','e','f','g','h','i','j','k'};
		
		int i = 0, j = ar1.length-1;
		
		for ( i = 0; i < ar1.length; i++) 
		{
			
			while(i<j && isVowel(ar1[i]))
			{
				i++;
			}
			
			while(i < j && !isVowel(ar1[j]))
			{
				j--;
			}
			if(i<j)
			{
			char temp = ar1[i];
			ar1[i] = ar1[j];
			ar1[j] = temp;
			}
		}
		System.out.println(Arrays.toString(ar1));
		
	}
	
	public static boolean isVowel(char c) 
	{
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
/* 
[a, i, e, c, b, d]
*/