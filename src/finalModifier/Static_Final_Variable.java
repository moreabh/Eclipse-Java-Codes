package finalModifier;

import java.util.Iterator;

public class Static_Final_Variable {
	
//	final static int a ; //CTE
	
	final static double PI = 22.0 / 7.0 ;
	final static double TEN_CUBE;
	
	static
	{
		int pow  = 1;
	for (int i = 0; i < 3; i++) 
	{
		pow = pow* 10; //10 100 1000
		
	}
	TEN_CUBE = pow;
		
	}
	
	public static void main(String[] args) {
		System.out.println(TEN_CUBE);
		
	}

}
//1000.0

