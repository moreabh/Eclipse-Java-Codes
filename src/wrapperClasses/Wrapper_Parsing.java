package wrapperClasses;

public class Wrapper_Parsing {
	
	public static void main(String[] args) {
		
		String s = "224244324";
		int i = Integer.parseInt(s);     // Unboxing
		System.out.println(i);
		
		String b = "true";
		boolean b1 = Boolean.parseBoolean(b);  //Unboxing
		System.out.println(b1);
		
		String s1 = "A";       //Character
		System.out.println(s1.charAt(0));   //Unboxing of char Using charAt()
		
		String byte1 = "127";
		byte b2 = Byte.parseByte(byte1);   //Unboxing
		System.out.println(b2);
		
		String short1 = "32767";
		short s2 = Short.parseShort(short1); //Unboxing
		System.out.println(s2);
		
//		String long1 = "9223372036854775807l";
//		long l1 = Long.parseLong(long1);		//Unboxing
//		System.out.println(l1);
		
		String float1 = "342.2";
		float  f1 = Float.parseFloat(float1);  //Unboxing
		System.out.println(f1);
		
		String double1 = "234324.545345";
		double d1 = Double.parseDouble(double1);
		System.out.println(d1);
		
	}

}
/*
 * 224244324
true
A
127
32767
342.2
234324.545345
*/
