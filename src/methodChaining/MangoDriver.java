package methodChaining;

public class MangoDriver {
	
		public static void main(String[] args) {
			
			Mango m1 = new Mango();
			m1.price = 1000;
			m1.type = "Hapus";
			m1.origin = "Ratnagiri";
		
		 	m1.printPrice().printType().printOrigin();
		}
	

}
