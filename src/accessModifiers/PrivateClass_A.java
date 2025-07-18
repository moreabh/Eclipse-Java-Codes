package accessModifiers;

public class PrivateClass_A {
	
	
	private int a =10;
	
	//Private Constructor
	private PrivateClass_A() {
		// TODO Auto-generated constructor stub
	}
	
	private void test() {
		
		System.out.println("From Class A");
	}
	
	public static void main(String[] args) {
		
		PrivateClass_A a = new PrivateClass_A();
		
		System.out.println(a.a); 	//Private Variable
		
		a.test();		//Private Method
		
	}
}
