package inheritance;

public class Son extends Father {
	
	String name = "Juju";
	
	public void displayName()
	{
		System.out.println("Son Name:-"+name);
	}
	
	public void displayFatherSonDetails()
	{
		System.out.println(name);
		System.out.println(super.name);
		//System.out.println(super);
		displayName();
		
		super.displayName();
	}
}
