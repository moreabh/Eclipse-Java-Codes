package stringProgramms;

public class StringWithoutNewOperator {

	public static void main(String[] args) {
		String s1 = "hii";
		String s2 = "hello";
		String s3 = "hii";
		
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		System.out.println("s1: "+s1.hashCode());
		System.out.println("s2: "+s2.hashCode());
		System.out.println("s3: "+s3.hashCode());
		System.out.println(s1.hashCode() == s3.hashCode());
	}
}
/*
true
true
s1: 103304
s2: 99162322
s3: 103304
true
*/
