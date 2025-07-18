/*Exception Object Propagation:- It is the process of moment exception object reference from called method to
the calling method. when the exception is not handled in called method is known as 
Exception object Propagation*/
package exceptions;

public class ObjectPropagation {

	public static void main(String[] args) {
		try {
			division(10,0);
		}
		catch(ArithmeticException ref) {
			System.out.println("Don't Divide By Zero");
		}
	}
	
	public static void division(int a, int b) {
		System.out.println(a/b);
	}
}
//o/p:-
//Don't Divide By Zero

