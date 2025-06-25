package abstraction;

public class HPWindowDriver {
	
	public static void main(String[] args) {
		
		HP h1 = new Windows();
		
		h1.print();
		
		HP h2 = new Linux();
		 
		h2.print();
	}

}
/*
 * O/P:-
Printing From Windows
Printing From Linux
*/
