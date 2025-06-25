package objectClass;

public class IntByte {
	
	byte a;
	byte b;
	int c;
	int d;
	
	public IntByte() {
		// TODO Auto-generated constructor stub
	}
	
	public IntByte(byte a, byte b, int c,  int d ) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public int hashCode() {
		
		return a+b+c+d;
	}
}
