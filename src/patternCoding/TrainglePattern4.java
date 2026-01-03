package patternCoding;

import java.util.Iterator;

public class TrainglePattern4 {

	public static void main(String[] args) {
		
		int a = 6;
		
		for (int i = 0; i < a; i++) { //0 1 2 3 4 5
			for (int j = 0; j < a; j++) {//0 1 2 3 4, 0 1 2 3, 0 1 2, 0 1, 0 
				if(j<a-i-1) {//a=5, a=6-1-1=4, a=6-2-1=3, a= 6-3-1=2, a=6-4-1=1, a=6-5-1=0
					   
					System.out.print(" "+" ");
				}
				else {
					System.out.print("* "+"  ");
				}
				
			}
			System.out.println();
			
		}
	}
}
