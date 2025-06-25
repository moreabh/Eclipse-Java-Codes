package objectClass;

public class Long {
	long a;
	long b;
	long c;
	long d;
	
	public Long() {
		// TODO Auto-generated constructor stub
	}
	
	public Long(long a, long b, long c, long d) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public int hashCode() {
		return  (int)(a+b+c+d);
	}

}
