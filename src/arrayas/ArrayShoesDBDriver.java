package arrayas;

public class ArrayShoesDBDriver {
	
	public static void main(String[] args) {
		
		ArrayShoesDB [] db = new ArrayShoesDB[3];
		
		db[0] = new ArrayShoesDB("Sparx", 1400, 8,"SportShoes");
		db[1] = new ArrayShoesDB("Asian", 1000, 7,"Causal Shoes");
		db[2] = new ArrayShoesDB("RedTape", 1300, 8,"Causal Shoes");

		System.out.println(db[0]);
		for (int i = 0; i < db.length; i++) {
			System.out.println(db[i].brand);	
		}
//		System.out.println(db[1].equals(db[0]));
//		System.out.println(db[0].hashCode());
//		System.out.println(db[1].hashCode());
//		System.out.println(db[1].toString());
//		System.out.println(db[0].toString());
	}

}
