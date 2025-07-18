//try with finally block
package exceptions;

public class TryWithFinallyBlock {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/5);
		}
		finally{
			System.out.println("Finally Executed");	
		}
	}
}
/*
 * 2
Finally Executed
*/
