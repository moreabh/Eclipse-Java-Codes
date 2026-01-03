package patternCoding;

public class TrainglePattern2 {
	public static void main(String[] args) {
		int a = 5;
		
		for (int i = 1; i <= a; i++) {//1 2 3 4 5
			for(int j=a; j>=i; j--) {
				
				System.out.print("*"+" ");	
			}
			System.out.println();
			
		}
	}

}
