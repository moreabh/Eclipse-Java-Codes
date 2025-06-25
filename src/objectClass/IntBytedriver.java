package objectClass;

public class IntBytedriver {
	
	public static void main(String[] args) {
		
		IntByte i1 = new IntByte((byte)12,  (byte)14, 3454, 343555);
		
		IntByte i2 = new IntByte((byte)12, (byte)14, 3454, 343555);
		 
		System.out.println(i1.toString());
		System.out.println(i2.toString());
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
	}
}
//o/p:-
//objectClass.IntByte@54b9b
//objectClass.IntByte@54b9b
//347035
//347035

