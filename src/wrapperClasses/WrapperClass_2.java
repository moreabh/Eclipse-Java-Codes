package wrapperClasses;

public class WrapperClass_2 {
	
	public static void main(String[] args) {
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		System.out.println(i1==i2);  //false, Comparing Object Reference
		
		System.out.println(i1.equals(i2)); //true, Comparing attributes
		
		System.out.println(i1.hashCode());  //10
		System.out.println(i2.hashCode());	//10

	}

}
/*
 * false
true
10
10
*/
