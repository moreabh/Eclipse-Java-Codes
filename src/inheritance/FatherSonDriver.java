package inheritance;

public class FatherSonDriver {
	
	public static void main(String[]args)
	{
		Son s1 = new Son();
		
		System.out.println(s1.name);
		s1.displayFatherSonDetails();
	}
}
/*
Juju
Juju
Raju
Son Name:-Juju
Father Name:-Raju
*/
