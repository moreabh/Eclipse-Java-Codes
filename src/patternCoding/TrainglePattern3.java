package patternCoding;

public class TrainglePattern3 {
	public static void main(String[] args) {
		 
		int a = 5;
		for (int i = 0; i < a ; i++) {
			for (int j = 0; j<a; j++) {
				if (j<i) {
						System.out.print(" "+" ");
					
				}
				else {
					System.out.print("*"+" ");
				}
			}
			System.out.println();
			
		}
	}

}
