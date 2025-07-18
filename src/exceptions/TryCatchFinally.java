//try catch and finally block
package exceptions;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException ref)
		{
			System.out.println("Don't Divide By Zero");
		}
		finally {
			
			System.out.println("Finally Block Executed");
		}
	}
}
/*
 * Don't Divide By Zero
Finally Block Executed
*/
