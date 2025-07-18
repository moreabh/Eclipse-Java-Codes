package wrapperClasses;

public class WrappperClass_1 {

	public static void main(String[] args) {
		int a = 10;
		Integer i = new Integer(a);        //Boxing
		System.out.println(i.toString());
		
		Double d = new Double(10.5);        //Boxing
		System.out.println(d);
		
		Character c = new Character('A');    //Boxing
		System.out.println(c);

	}

}
/*
 * 10
10.5
A
*/
