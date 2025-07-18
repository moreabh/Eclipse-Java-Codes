//try catch exception handling
//ArithmeticException
package exceptions;

import java.util.Scanner;

public class ExceptionExample {
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:- ");
		int num = sc.nextInt();
		
		System.out.println("Enter Second Number:- ");
		int den = sc.nextInt();
		
		try 
		{
			int ans = num/den;
			System.out.println(ans);
		}
		catch(ArithmeticException ref)
		{
			System.out.println("Don't Divide By Zero");
		}
		System.out.println("Thanks");
	}	
}
/*
Enter First Number:- 
10
Enter Second Number:- 
0
Don't Divide By Zero
Thanks
*/