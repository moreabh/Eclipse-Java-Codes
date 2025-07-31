package stringProgramms;

public class StringUsingNewOAndWithoutNewO
{
	public static void main(String[] args)
	{
//		String s1 = new String("hii");
//		String s2 = new String("hii");
//		String s3 = "hii";
//		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s3.hashCode());
//		System.out.println(s1 == s3);
		
		String s1 = new String("abhi");
		String s2 = "abhi";
		//String s3 = new String("abhi");
		//String s4 = new String("abh");
		
		System.out.println(s1.hashCode());
		int a = s1.hashCode();
		int b = s2.hashCode();
		System.out.println(s2.hashCode());
//		System.out.println(s3.hashCode());
//		System.out.println(s4.hashCode());
		System.out.println(a == b);
		System.out.println(s1.equals(s2));
		
	}
}

/*
2987234
2987234
true
true
*/
