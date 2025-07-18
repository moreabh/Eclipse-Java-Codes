package finalModifier;

public class NonStaticFinal_Variable {
	
//	final String name ;//CTE
	
	final double price = 100.22;
	final int size ;
	final char grade;
	
	{
		//non static block 
		size = 10;  //initialized 
 	}
	
	public NonStaticFinal_Variable(char grade) {
		
		this.grade = grade;
	}
	
	public static void main(String[] args) {
		
		NonStaticFinal_Variable n = new NonStaticFinal_Variable('a');
		
		
		System.out.println(n.grade);
		System.out.println(n.size);
		System.out.println(n.price);
	}

}
/*
 * a
10
100.22
*/
