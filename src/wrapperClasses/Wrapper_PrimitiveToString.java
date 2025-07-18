package wrapperClasses;

public class Wrapper_PrimitiveToString {
	
	public static void main(String[] args) {
		
		int a = 100;
		
		String s = String.valueOf(a); //Boxing
		System.out.println(s);
		System.out.println(s+20);     //int converted to string 
		
		boolean b = true;
		String s1 = String.valueOf(b); 	//Boxing
		System.out.println(s1+100);     // Converted to String Format
		
		char c = 'a';
		String s2 = String.valueOf(c);  //Boxing
		System.out.println(s2);
		
	}

}
/*
 100
10020
true100
*/
