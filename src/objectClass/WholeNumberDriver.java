package objectClass;

public class WholeNumberDriver {
	
	public static void main(String[] args) {
			
		WholeNumber w1 = new WholeNumber(1, 234, 36473242, 23343434343l);
		
		WholeNumber w2 = new WholeNumber(1, 234, 36473242, 23343434343l);

		System.out.println(w1.toString());
		System.out.println(w2.toString());
		
		System.out.println(w1.hashCode());
		System.out.println(w2.hashCode());
		
	}

}
//o/p :-
//objectClass.WholeNumber@718d14ec
//objectClass.WholeNumber@718d14ec
//1905071340
//1905071340

