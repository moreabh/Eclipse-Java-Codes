package arrayas;

public class ArrayStoreElements {

	public static void main(String[] args) {
		
	
	int [] ar = new int [5];
	
	ar[0] = 10;
	ar[1] = 20;
	ar[2] = 30;
	ar[3] = 40;
	ar[4] = 50;
	
	                                                                                           
	System.out.println(ar.length);

	for(int i=0; i<ar.length; i++)
	{
		System.out.println(ar[i]);
	}
  }
}