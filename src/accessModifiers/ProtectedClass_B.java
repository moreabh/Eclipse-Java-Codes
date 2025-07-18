package accessModifiers;

public class ProtectedClass_B {

	public static void main(String[] args) {
		
		ProtectedClass_A p1 = new ProtectedClass_A();
		
		System.out.println(p1.a);
		
		p1.test();
		
	}

}
/*
100
From ProtectedClass_A test() method

*/