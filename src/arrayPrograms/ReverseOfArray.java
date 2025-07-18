package arrayPrograms;

public class ReverseOfArray{
	
	public static void main(String[] args) {
		
		int [] ar = {10,20,30,40,50};
		System.out.println("Length: "+ar.length);
		int [] rev = revOfArray(ar);
		
		 for (int i = 0; i < rev.length; i++) {
			System.out.print(rev[i]+" ");
			
		}
	}
	public static int[] revOfArray(int[]ar) {
		
		int [] rev = new int[ar.length];
		
		for (int i = 0; i < ar.length; i++) {
			
			rev[ar.length-1-i] = ar[i];	
		}
		return rev;
	}
}
/*
 * Length: 5
50 40 30 20 10 */
