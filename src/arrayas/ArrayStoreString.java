package arrayas;

public class ArrayStoreString {

	public static void main(String[] args) {
		
		String [] ar = new String [3];
		
		ar[0] = "Abhi";
		ar[1] = "Pruthvi";
		ar[2] = "Raju";
		
		System.out.println(ar.length);
		
		 for (int i = 0; i < ar.length; i++) 
		 {
			 System.out.println(ar[i]);
		}
		
	}
}

/*
3
Abhi
Pruthvi
Raju
*/
