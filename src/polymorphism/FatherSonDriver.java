package polymorphism;

public class FatherSonDriver {
	
	public static void main(String[]args)
	{
		
		Father f1 = new Son();
	
		f1.finance();
		f1.name();
	}

}
/*
o/p:-

Rich
Good Boy
*/
