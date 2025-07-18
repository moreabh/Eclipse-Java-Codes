//Finally Block
package exceptions;

public class FinallyBlock {
	public static void main(String[] args) {
		
		System.out.println("Main block Start");
		try {
			String s = null;
			System.out.println(s.length());
		}
		catch(NullPointerException ref) {
			System.out.println("Don't call object by null ref");
			try {
			System.out.println(10/0);
			}
			catch(ArithmeticException reff) {
				System.out.println("Don't Divide By Zero");
			}
		}
		finally {
			System.out.println("Finally Block Executed");
		}
	}
}
/*
Main block Start
Don't call object by null ref
Don't Divide By Zero
Finally Block Executed
*/