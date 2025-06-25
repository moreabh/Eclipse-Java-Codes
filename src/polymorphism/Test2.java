package polymorphism;

public class Test2 extends Test1 {
	
	String a = "Hi";
	static String b = "Bye";
	
	public static void demo()
	{
		System.out.println("From static Demo of class Test2");
	}
	public void test() //method overriding 
	{
		System.out.println("From Non-static test of class Test2");
	}
}

