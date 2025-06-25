package objectClass;

public class Character {
	
	char a;
	char b;
	char c;
	char d;
	
	public Character() {
		// TODO Auto-generated constructor stub
	}
	
	public Character(char a, char b, char c, char d) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public int hashCode() {
		
		return a+b+c+d;
	}

}
