package wrapperClasses;

public class Wrapper_AutoBoxing_AutoUnboxing {
	
	public static void main(String[] args) {
		
		Integer i = 10;  		//auto-Boxing
		System.out.println(i);
		int a = i; 				//auto-Unboxing
		System.out.println(a);
		
		Character c = 'a';    	//auto-Boxing
		System.out.println(c);   
		char ch = c;			//auto-Unboxing
		System.out.println(ch);
		
		Boolean b = true;		//auto-Boxing
		System.out.println(b);
		boolean b1 = b;			//auto-Unboxing
		System.out.println(b1);
		
		String s = new String("Abhi"); 
		System.out.println(s);
		String s1 = s;
		System.out.println(s1);
		
	}

}
