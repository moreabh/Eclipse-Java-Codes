//Nested try catch block
package exceptions;

public class NesteadTryBlock {

	public static void main(String[] args) {
		try
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println("Arithmetic Exception Handled");
			String s = null;
			try {
				System.out.println(s.length());
			}
			catch(NullPointerException ex) {
				System.out.println("Handling Null Pointer From Nested catch block");
			}
			System.out.println("Hello");
		}
		
	}
}
/*
 * Arithmetic Exception Handled
Handling Null Pointer From Nested catch block
Hello
*/
