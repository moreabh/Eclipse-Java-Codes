package inheritance;

public class ABDriver {
	
	public static void main(String[]args)
	{
		B b1 = new B();
		
		b1.displayA();
		b1.displayB();
		
		A a1 = new A();
		
		a1.displayA();
		//a1.displayB(); CTE 
	}
}

/*
 *
5
a
5
*/
