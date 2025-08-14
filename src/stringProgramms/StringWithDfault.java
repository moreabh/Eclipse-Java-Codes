package stringProgramms;

public class StringWithDfault {

	public static void main(String[] args) {
		String s;
		
		String s1 = new String(s = "bye");
		
		System.out.println(s1.hashCode()+"   "+s1);
		System.out.println(s.hashCode()+"   "+s);
		
		String s2 = "bye";
		System.out.println(s2.hashCode()+"   "+s2);

		String s3 = new String("bye");
		System.out.println(s3.hashCode()+"   "+s3);
		
		System.out.println();
		
		System.out.println(s == s2);//true
		System.out.println(s2 == s3);//false
		
		System.out.println(s.equals(s3));
		
		System.out.println();
		
		String s4 = new String("Hii");
		System.out.println(s4.hashCode()+"   "+s4);
		
		String s5 = new String("Hii");
		System.out.println(s5.hashCode()+"   "+s5);
		
		System.out.println(s4 == s5);
	}

}

/*
 * 98030   bye
98030   bye
98030   bye
98030   bye

true
false
true

72552   Hii
72552   Hii
false
*/
