package patternCoding;

public class ThreeByFourPattern {

	public static void main(String[]args) {
		
		int a = 4;
		for(int i = 0; i<a;i++) {
			for(int j=0; j<a-1; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
