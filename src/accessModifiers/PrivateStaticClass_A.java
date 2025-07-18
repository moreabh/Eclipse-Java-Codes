package accessModifiers;

public class PrivateStaticClass_A {
	
	private static int a = 10;
	
//	private static PrivateStaticClass_A() {           // private static constructor is not possible
//		// TODO Auto-generated constructor stub
//	}
	
	private static void test() //The method test() from the type PrivateStaticClass_A is never used locally
	{
		System.out.println("From PrivateStaticClass_A method test();");
	}
	
	public static void main(String[] args) {
		
		PrivateStaticClass_A a = new PrivateStaticClass_A();
		
		System.out.println(a.a);
		
		a.test();
	}

}
