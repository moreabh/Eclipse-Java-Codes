package arrayPrograms;

public class PalindromeArray {
	public static void main(String[] args) {
		int [] ar = {1,1};
		
		System.out.println(checkPalindrome(ar));
	}
	 
	public static boolean checkPalindrome(int[]ar)
	{
		
		int i = 0, j = ar.length-1;
		System.out.println(ar.length);
		while(i<j)
		{
			if(ar[i] != ar[j])
			{
				break;
			}
			else
			{
				i++;
				j--;
			}
		
		
			if(i>=j)
			{
				System.out.println("It is Palindrome");
			}
			else
			{
				System.out.println("It is Not a Palindrome");
			}
		}
	return true;
	}
}
