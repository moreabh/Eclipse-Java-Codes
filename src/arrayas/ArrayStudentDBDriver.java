package arrayas;

public class ArrayStudentDBDriver {
	
	public static void main(String[] args) {
		ArrayStudentDB [] db = new ArrayStudentDB[5];
		
		db[0] = new ArrayStudentDB("Abhi","DOT",660,21);
		db[1] = new ArrayStudentDB("Pruthvi","DOT",661,22);
		db[2] = new ArrayStudentDB("Harsh","DOT",662,21);
		db[3] = new ArrayStudentDB("Adi","DOT",663,21);
		db[4] = new ArrayStudentDB("Ommya","DOT",664,22);
		
		for (int i = 0; i < db.length; i++) {
			
			System.out.println(db[i].name);
			System.out.println(db[i].age);
			
		}
		
		System.out.println(db[0]);
	}

}
/*
 * Abhi
21
Pruthvi
22
Harsh
21
Adi
21
Ommya
22
[Name:Abhi,Collage: DOT,roll: 660,age: 21]
*/
