package accessModifiersPack_2;

import accessModifiers.ProtectedClass_A;

public class ProtectedClass_C extends ProtectedClass_A {

	public static void main(String[] args) {
		
		ProtectedClass_C p1 = new ProtectedClass_C();
		
		System.out.println(p1.a);
		
		p1.test();
		
	}
}
/*
 * 100
From ProtectedClass_A test() method
*/
