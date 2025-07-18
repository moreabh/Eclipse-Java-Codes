package accessModifiers;

public class DefaultClass_A {
	
	int a = 20;

	DefaultClass_A() {
		// TODO Auto-generated constructor stub
	}
	
	void test() {
		System.out.println("From DefaultCLass_A test() ");
	}
	
	public static void main(String[] args) {
		
		DefaultClass_A d1 = new DefaultClass_A();
		
		System.out.println(d1.a);
		
		d1.test();
		
	}
}
/*
 * 20
From DefaultCLass_A test() 
*/
