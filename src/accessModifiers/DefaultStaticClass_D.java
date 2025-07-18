package accessModifiers;

public class DefaultStaticClass_D {

	static int a = 50;
//	static DefaultStaticClass_D() {
//		// TODO Auto-generated constructor stub
//	}
	
	static void test() {
		System.out.println("From Default StaticClass_D test()");
	}
	
	public static void main(String[] args) {
		
		DefaultStaticClass_D d1 = new DefaultStaticClass_D();
		
		 System.out.println(d1.a);
		  
		 d1.test();
	}

}
