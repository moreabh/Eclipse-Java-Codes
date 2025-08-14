package stringProgramms;

public class StringNewKAlongWithConstructor {

	public static void main(String[] args) {
		
		String s1 = new String("Hii");
		System.out.println(s1.hashCode()+"  "+s1);
		
		String s2 = new String("Hello");
		String s3 = new String("Hii");
		System.out.println(s3.hashCode()+"  "+s3);
		
		String.join(s3, args);
		System.out.println(s1 == s3);//here object reference is checked
		System.out.println(s1.equals(s3));//and here objects attributes are checked
		 //so attributes are same thats why o/p is true. 
	}
}
/*
 false
true
*/
