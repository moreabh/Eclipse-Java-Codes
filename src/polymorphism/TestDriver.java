package polymorphism;

public class TestDriver {
	
	public static void main(String[]args)
	{
		Test1 t1 = new Test2(); //Upcasting
		
		t1.demo(); //method shadowing 
		t1.test(); //method overriding
		
		System.out.println(t1.a); // variable shadowing 
		System.out.println(t1.b ); // variable shadowing 
 
	}

}
/*
From Static demo of class Test1
From Non-static test of class Test2
10
100
*/
