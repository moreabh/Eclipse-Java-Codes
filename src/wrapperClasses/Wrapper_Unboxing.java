//Boxing    Unboxing

package wrapperClasses;

public class Wrapper_Unboxing {
	public static void main(String[] args) {
		
		Integer i = new Integer(100); //BOxing
		
		int ans = i.intValue();       //Unboxing
		System.out.println(ans);
		
		Character ch = new Character('A'); //Boxing
		
		char c = ch.charValue();		//Unboxing
		System.out.println(c);
		
		Boolean b = new Boolean(false);//Boxing
		
		boolean bl = b.booleanValue();  //Unboxing
		System.out.println(b);          
		
		Long l = new Long(132453454356565654l);  //Boxing
		
		long  l1 = l.longValue();   //Unboxing
		System.out.println(l1);
	
	}

}
/*
 * 100
A
false
132453454356565654
*/
