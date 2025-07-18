//try catch Exception Handling
//NullPointerException
package exceptions;

public class ExceptionString {

	public static void main(String[] args) {
		
		String s = null;
		
		try {
			System.out.println(s.length());	
		}
		catch(NullPointerException ref) {
			System.out.println("Don't Call Object By Null Reference");
		}
	}

}
//Don't Call Object By Null Reference
