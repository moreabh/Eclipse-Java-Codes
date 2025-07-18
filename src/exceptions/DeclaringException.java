/*Declaring the Exceptions:- 
 * A checked exception must be handled or declared .
 * When we can't handled it every time then we declare it using "throws" keyword along with the exception name
 * with the method Declaration Statement */

package exceptions;

public class DeclaringException {
	
	public static void main(String[] args) throws InterruptedException //declaring the exception with exception name
	{
		for(int i=0;i<5;i++) {
			
			System.out.println("Heyy");
			Thread.sleep(2000);
		}
	}

}
/*
 * Heyy
Heyy
Heyy
Heyy
Heyy
*/
