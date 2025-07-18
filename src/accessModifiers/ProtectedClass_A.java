package accessModifiers;

public class ProtectedClass_A {

	protected int a = 100;
	
	protected ProtectedClass_A() {
		// TODO Auto-generated constructor stub
	}
	
	protected void test() {
		System.out.println("From ProtectedClass_A test() method");
	}
	
	public static void main(String[] args) {
		ProtectedClass_A p1 = new ProtectedClass_A();
		
		   System.out.println(p1.a);
		   
		   p1.test();
	}
}

/*
 * 100
From ProtectedClass_A test() method
*/
