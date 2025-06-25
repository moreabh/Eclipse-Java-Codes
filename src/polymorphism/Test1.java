package polymorphism;

public class Test1 {
	
	int a = 10;
	static int b = 100;
	
	public static void demo() // method shadowing 
	{
		System.out.println("From Static demo of class Test1");
	}
	public void test()
	{
		System.out.println("From Non-static test of class Test1");
	}
}
