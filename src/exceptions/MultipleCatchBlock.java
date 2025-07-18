//try with Multiple Catch Block exception Handling and
//order of declaring the Exceptions

package exceptions;

//import java.util.InputMismatchException;
import java.util.*;

public class MultipleCatchBlock {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter First Number:- ");
			int num = sc.nextInt();
			
			System.out.println("Enter Second Number:-");
			int den = sc.nextInt();
			
			int ans = num/den;
			System.out.println(ans);
			
		}
		catch(ArithmeticException ref)
		{
			System.out.println("Don't Divide By Zero");
		}
		catch(NullPointerException ref) {
			System.out.println("Don't call object by null reference");
		}
		catch(InputMismatchException ref) {
			System.out.println("Declare Proper Input");
		}
		catch(Throwable ref) {
			System.out.println("Exception Handeled by Throwable Type Exception");
		}
		System.out.println("Thank You");
	}
}
/*
Enter First Number:- 
10
Enter Second Number:-
dad
Declare Proper Input
Thank You
*/