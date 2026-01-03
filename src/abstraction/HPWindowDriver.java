package abstraction;

public class HPWindowDriver {
	
	public static void main(String[] args) {
		
		HP h1 = new Windows();
		
		h1.print();
		h1.read();
		
		HP h2 = new Linux();
		 
		h2.print();
		h2.read();
	}

}
/*
 * O/P:-
Printing From Windows
Printing From Linux
*/
