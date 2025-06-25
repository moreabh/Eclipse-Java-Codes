//public int hashCode() for wholeNumber

package objectClass;

public class WholeNumber {
	int a;
	int b;
	int c;
	long d;
	
	public WholeNumber() {
		// TODO Auto-generated constructor stub
	}
	
	public WholeNumber(int i, int j, int c, long d)
	{
		this.a = i;
		this.b = j;
		this.c = c;
		this.d = d;
	}
	
	public int hashCode() {
		
		return a+b+c+(int)d;
	}
}
