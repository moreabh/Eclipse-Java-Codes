package wrapperClasses;

public class WrapperClass_3 {
	
	public static void main(String[] args) {
		
		Byte b1 = new Byte((byte)100);
		Integer i1 = new Integer(100);
		
		System.out.println(b1.equals(i1)); //false , Unlikely argument type for equals(): Integer seems to be unrelated to Byte
		//This is not possible because as they are different objects, From Different Wrapper Classes
		
		//We can Only Compare Objects reference when both objects are from same wrapper Class 
		 
	}

}
