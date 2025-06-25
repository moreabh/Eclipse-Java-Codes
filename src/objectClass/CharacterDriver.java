package objectClass;

public class CharacterDriver {
	
	public static void main(String[] args) {
		
		Character c1 = new Character('A', 'B', 'C', 'D');
		
		Character c2 = new Character('A', 'B', 'C', 'D');
		
			System.out.println(c1.toString());
			System.out.println(c2.toString());
			System.out.println(c1.hashCode());
			System.out.println(c2.hashCode());
	}
}
//O/P:-
//objectClass.Character@10a
//objectClass.Character@10a
//266
//266
