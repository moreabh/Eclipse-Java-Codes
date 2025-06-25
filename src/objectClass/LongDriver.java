package objectClass;

public class LongDriver {
	public static void main(String[] args) {
		
		Long l1 = new Long(123455677888l, 232334234l, 2432434243423l, 334324232344l);
		
		Long l2 = new Long(123455677888l, 232334234l, 2432434243423l, 334324232344l);
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		
		System.out.println(l1.hashCode());
		System.out.println(l2.hashCode());
	}

}
//o/p:-
//objectClass.Long@fc094151
//objectClass.Long@fc094151
//-66502319
//-66502319

